package com.trianz.lms.controller;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowException;
import com.liferay.portal.kernel.workflow.WorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.kernel.workflow.WorkflowInstance;
import com.liferay.portal.kernel.workflow.WorkflowInstanceManagerUtil;
import com.liferay.portal.kernel.workflow.WorkflowTask;
import com.liferay.portal.kernel.workflow.WorkflowTaskManagerUtil;
import com.liferay.portal.model.Company;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.trianz.lms.model.LMSCompOffLeaveDetails;
import com.trianz.lms.model.LMSEmployeeDetails;
import com.trianz.lms.model.LMSLeaveInformation;
import com.trianz.lms.model.LMSLeaveType;
import com.trianz.lms.model.LeaveBalance;
import com.trianz.lms.service.LMSCompOffLeaveDetailsLocalServiceUtil;
import com.trianz.lms.service.LMSEmployeeDetailsLocalServiceUtil;
import com.trianz.lms.service.LMSLeaveInformationLocalServiceUtil;
import com.trianz.lms.service.LMSLeaveTypeLocalServiceUtil;
import com.trianz.lms.service.LeaveBalanceLocalServiceUtil;
import com.trianz.lms.service.persistence.LMSCompOffLeaveDetailsPK;
import com.trianz.lms.util.SendMail;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.mail.internet.AddressException;

public class JobListnerController implements MessageListener{

	@Override
	public void receive(Message arg0) throws MessageListenerException {
		
	//updateEmpLeaveBalances();
		/*
		
		// TODO Auto-generated method stub
		System.out.println("in job listener controller LMS Portlet=============");
		try {
		DateFormat df = new SimpleDateFormat("dd/MM/yy");

		String todayDate = df.format(new Date());
        Date currentDate = df.parse(todayDate);
      
		List<Company> companiesList = CompanyLocalServiceUtil.getCompanies();
		//System.out.println(" companiesList size " + companiesList.size() );
		long companyId = 0;
		for(Company cmpny : companiesList){
			
			companyId  = cmpny.getCompanyId();
		}
		
        int leaveRecordsCount;
			leaveRecordsCount = LMSLeaveInformationLocalServiceUtil.getLMSLeaveInformationsCount();
			List<LMSLeaveInformation> leaveRecords =   LMSLeaveInformationLocalServiceUtil.getLMSLeaveInformations(0, leaveRecordsCount);
			for(LMSLeaveInformation leave : leaveRecords){
				
				Date leaveStartDate = leave.getStartDate(); // getting 2 days back date
			
				if(leaveStartDate != null && currentDate.after(leaveStartDate) && currentDate != leaveStartDate && leave.getIsDraft() != "Y"  && (leave.getApprovalStatus().equalsIgnoreCase("Pending") || leave.getApprovalStatus().equalsIgnoreCase("Incomplete"))){
					//System.out.println("leave SNO " + leave.getLeaveRequestId() +" leaveStartDate" + leaveStartDate +" currentDate " + currentDate);
					String leaveRequestId = leave.getLeaveRequestId();
					int EmployeeId = leave.getEmployeeId();
					//System.out.println("companyId : " + companyId);
				List<WorkflowTask> workFlowTask=WorkflowTaskManagerUtil.getWorkflowTasks(companyId, false, 0, WorkflowTaskManagerUtil.getWorkflowTaskCount(companyId, false), null);
					//System.out.println(" workFlowTask size " + workFlowTask.size());
					for(WorkflowTask task : workFlowTask){
						//System.out.println("leaveStartDate" + leaveStartDate + " current Date : " + currentDate + " currentDate.after(leaveStartDate) " + currentDate.after(leaveStartDate));

						WorkflowInstance workflowInstance = WorkflowInstanceManagerUtil.getWorkflowInstance(companyId, task.getWorkflowInstanceId());
						Map<String, Serializable> workflowContext = workflowInstance.getWorkflowContext();
	
						String title = (String)workflowContext.get("leaveRequestId");
	
						if(title!=null){
							if(title.equalsIgnoreCase(leaveRequestId)){
								//System.out.println("title : " + title + " leaveRequestId " + leaveRequestId);
								//making status as approved in Leave information table
								leave.setApprovalStatus("Approved");
								LMSLeaveInformationLocalServiceUtil.updateLMSLeaveInformation(leave);
								//approving the same workflow instance
								//System.out.println("before approving");
								WorkflowTaskManagerUtil.completeWorkflowTask(companyId, task.getAssigneeUserId(), task.getWorkflowTaskId(), "approve", "approving", workflowContext);
								//System.out.println("after Approving");
								//deducting the leave balances
								double duration = leave.getDuration();
								String leaveType = leave.getAbsenceType();
								leaveType = leaveType.replace("\n", "").replace("\r", "");
							
								LeaveBalance lbalance = LeaveBalanceLocalServiceUtil.getLeaveBalance(EmployeeId);
								double elBal = lbalance.getELBalance();
								double clBal = lbalance.getCLBalance();
								double compBal = lbalance.getCompOffLeaveBalance();
								if(("Contingency Leave").equalsIgnoreCase(leaveType)){
									System.out.println(" deducting CL leaves ");
									clBal-=duration;
								}else if(("Earned Leave").equalsIgnoreCase(leaveType.trim())){
									System.out.println(" deducting EL leaves ");
									elBal-=duration;				
								}else if(("Compensatory Off").equalsIgnoreCase(leaveType.trim())){
									System.out.println(" deducting compoff leaves ");
									compBal-=duration;
								}else{
										System.out.println("neither EL, CL nor compBal");					
									}
								
								lbalance.setELBalance(elBal);
								lbalance.setCLBalance(clBal);
								lbalance.setCLBalance(compBal);
								
								LeaveBalanceLocalServiceUtil.updateLeaveBalance(lbalance);
							}
						}
						
						}
					}
				}
		
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WorkflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		//CompOffBalanceExpiry();
		
	*/}
	
	public void EarnBalanaceExpiryNotification(){/*
		//get all balances of all employees,
		// if Earned Leave balance is greater than 45 then a mail should trigger saying either encash the leaves or utilise.
		try {
		List<LeaveBalance> employeesLeaveBalances = LeaveBalanceLocalServiceUtil.getLeaveBalances(0, LeaveBalanceLocalServiceUtil.getLeaveBalancesCount());
		List<Integer> empIdsList = new ArrayList<Integer>();
			for(LeaveBalance empLB : employeesLeaveBalances){
				double ELBalance = empLB.getELBalance();
				if(ELBalance >= 75){
					empIdsList.add(empLB.getEmployeeId());
					
					System.out.println("Emp Id's: "+empLB.getEmployeeId());
				}
			}
			//need to uncomment it for production
			for(Integer empId : empIdsList){
				try {
					//SendMail.sendmailEL(empId);
				} catch (AddressException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/}
	
	
	public void CompOffBalanceExpiry(){/*
		try {
		
		Calendar cal = Calendar.getInstance();
		Map<Integer,Integer> empCompOffIdList = new HashMap<Integer,Integer>();

		Date currentDate = (cal.getTime());
		
			
			List<LMSCompOffLeaveDetails> allEmpCompOffDetailsList = LMSCompOffLeaveDetailsLocalServiceUtil.getLMSCompOffLeaveDetailses(0, LMSCompOffLeaveDetailsLocalServiceUtil.getLMSCompOffLeaveDetailsesCount());
			for(LMSCompOffLeaveDetails cmpOff : allEmpCompOffDetailsList){
				Date compOffCreated = cmpOff.getCreatedDate();
				long timeDiff = Math.abs(currentDate.getTime() - compOffCreated.getTime()); 
				
				//System.out.println(TimeUnit.MILLISECONDS.toDays(timeDiff) + " - " + cmpOff.getCompOffId());
				long days = TimeUnit.MILLISECONDS.toDays(timeDiff);
				
				String status = cmpOff.getStatus();
				if(days>30 && !status.equalsIgnoreCase("used") ){
	
					empCompOffIdList.put(cmpOff.getCompOffId(), cmpOff.getEmployeeID());
				}
			}
			//System.out.println(empCompOffIdList.size());
			Set<Integer> cmpOffIds = new HashSet<Integer>();
			cmpOffIds = empCompOffIdList.keySet();
			
			for(Integer cId : cmpOffIds){
				
				LMSCompOffLeaveDetails cmpOff = LMSCompOffLeaveDetailsLocalServiceUtil.getCompOffDetailsbyCompOffId(cId);  //here primary key should be emp id and compoff date combination
				
				LMSCompOffLeaveDetailsPK lpk = new LMSCompOffLeaveDetailsPK() ;
				lpk.setCompoffDate(cmpOff.getCompoffDate());
				lpk.setEmployeeID(cmpOff.getEmployeeID());
				
				
				LMSCompOffLeaveDetails compOffRecord = LMSCompOffLeaveDetailsLocalServiceUtil.getLMSCompOffLeaveDetails(lpk);
				compOffRecord.setStatus("Expired");
				LMSCompOffLeaveDetailsLocalServiceUtil.updateLMSCompOffLeaveDetails(compOffRecord);
			
				
				LeaveBalance lbal = LeaveBalanceLocalServiceUtil.getLeaveBalance(empCompOffIdList.get(cId));
				double cmpLeaveBalance = lbal.getCompOffLeaveBalance();
				cmpLeaveBalance-=1;
				lbal.setCompOffLeaveBalance(cmpLeaveBalance);
				LeaveBalanceLocalServiceUtil.updateLeaveBalance(lbal);
			}
			
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//getting all records of compoff table,
		//checking record where compOffdate is 30 days back and status is NotUsed, then change its status as Used,
		// minus 1 in the Compoff Balance for that employee. 
		
	*/}
	
	
	public void updateEmpLeaveBalances(){
		
		//int employeeId = getLoggedInEmployeeId(resourceRequest, resourceResponse);
		List<LMSEmployeeDetails> allEmployees;
		try {
			allEmployees = LMSEmployeeDetailsLocalServiceUtil.getLMSEmployeeDetailses(0, LMSEmployeeDetailsLocalServiceUtil.getLMSEmployeeDetailsesCount());
			for(LMSEmployeeDetails employee : allEmployees){
				
				int employeeId = employee.getEmployeeId();
				/*if( employeeId==102885 ){*/
				LMSEmployeeDetails empDetails = LMSEmployeeDetailsLocalServiceUtil.getLMSEmployeeDetails(employeeId);
				Calendar caleff = Calendar.getInstance();
				Calendar caljoin = Calendar.getInstance();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date joiningDate = empDetails.getJoiningDate();           // if effective date is less than joining date need to validate
				
				System.out.println("actual joining date : " + joiningDate);
				//String effDateString = req.getParameter("effDate");
				
				Date effectiveDate = df.parse("2017-4-26");
				System.out.println("actual effective date : " + effectiveDate);
				caleff.setTime(effectiveDate);
				caljoin.setTime(joiningDate);
				caljoin.add(Calendar.DATE, 2);	// adding 2 days to joining date
				
				double finalELLeave = 0;
				double finalCLLeave = 0;
				System.out.println("Employee Id " + employeeId + "joining date : " + caljoin.getTime());
				
				int numberOfYears = caleff.get(Calendar.YEAR)-caljoin.get(Calendar.YEAR);
				int numberofMonths = caleff.get(Calendar.MONTH)-caljoin.get(Calendar.MONTH);
				//int numberofDays = caleff.get(Calendar.DATE)-caljoin.get(Calendar.DATE);

				//System.out.println(caleff.get(Calendar.DATE) + "---"  +caleff.get(Calendar.MONTH) + "==== " + caleff.get(Calendar.YEAR) );
				//System.out.println(caljoin.get(Calendar.DATE) + "---"  + caljoin.get(Calendar.MONTH) + "==== " + caljoin.get(Calendar.YEAR));
				System.out.println( " numberOfYears " + numberOfYears + " numberofMonths " + numberofMonths);

				
				int totalNumberOfMonths = 0;
				if(numberOfYears!=0){
						totalNumberOfMonths+=  numberOfYears*12;;	
				}if(numberofMonths!=0){
					totalNumberOfMonths+= numberofMonths;
				}
				System.out.println(" totalNumberOfMonths " + totalNumberOfMonths);

				
				int ELLeaveTypeCode = LMSLeaveTypeLocalServiceUtil.getLeaveTypeCodeByName("Earned Leave");
				int CLLeaveTypeCode = LMSLeaveTypeLocalServiceUtil.getLeaveTypeCodeByName("Contingency Leave");
			
				LMSLeaveType ELLeave = LMSLeaveTypeLocalServiceUtil.getLMSLeaveType(ELLeaveTypeCode);
				LMSLeaveType CLLeave = LMSLeaveTypeLocalServiceUtil.getLMSLeaveType(CLLeaveTypeCode);
				
				double totalEarnedLeaves = totalNumberOfMonths*ELLeave.getAccrualValue();
				double totalContingencyLeaves = totalNumberOfMonths*CLLeave.getAccrualValue();
				System.out.println(" totalEarnedLeaves " + totalEarnedLeaves + " === " + " totalContingencyLeaves " +  totalContingencyLeaves);
				List<LMSLeaveInformation> leaveinfo = LMSLeaveInformationLocalServiceUtil.getleavesByEmployeeID(employeeId);
				System.out.println(" leaveinfo size " + leaveinfo.size());
				double ELCount = 0;
				double CLCount = 0;
				for(LMSLeaveInformation linfo: leaveinfo){
					String absenceType = linfo.getAbsenceType();
					Calendar calStartDate = Calendar.getInstance();
					Date startDate = linfo.getStartDate();
					calStartDate.setTime(startDate);
					calStartDate.add(Calendar.DATE, 2);// adding 2 days to start date
					System.out.println("start date of leave " + calStartDate.getTime());
					System.out.println("effective date : " + effectiveDate);
					String approvalStatus = linfo.getApprovalStatus();
					
					System.out.println("absenceType : " + absenceType + " approval status " + approvalStatus  + " leave Request ID " + linfo.getLeaveRequestId());
					                                        
					if(absenceType.equals("Earned Leave")  && !(calStartDate.getTime()).after(effectiveDate) && approvalStatus.equals("Approved")){
						System.out.println("inside Earned Leave" + linfo.getDuration());
						ELCount+= linfo.getDuration();									
					}else if(absenceType.equals("Contingency Leave") && !(calStartDate.getTime()).after(effectiveDate) && approvalStatus.equals("Approved")){
						System.out.println("inside Contingency Leave" + linfo.getDuration());
						CLCount +=linfo.getDuration();					
					}
				}
				
			System.out.println("ELCount to be deducted from totalEarnedLeaves : " + ELCount + " CLCount to be deducted from totalContingencyLeaves " + CLCount);
			//if date of joining is after 15th of the month
			//System.out.println("joining date only " + caljoin.get(Calendar.DATE));
			if(caljoin.get(Calendar.DATE)>15){
				System.out.println("date of joining is greater then 15th ");
				finalELLeave = totalEarnedLeaves-ELCount;
				finalCLLeave = totalContingencyLeaves-CLCount;
				
				finalELLeave-=0.5;
				finalCLLeave-=0.5;
			}else{
				System.out.println("date of joining is less then 15th ");
				finalELLeave = totalEarnedLeaves-ELCount;
				finalCLLeave = totalContingencyLeaves-CLCount;
			}			
			
			System.out.println("EmployeeId " + employeeId + " final EL Leave " + finalELLeave + " final CL Leave " + finalCLLeave );
			LeaveBalance leavebal = LeaveBalanceLocalServiceUtil.getLeaveBalanceByEmpID(employeeId);
			
			if(leavebal == null){
				leavebal = LeaveBalanceLocalServiceUtil.createLeaveBalance(employeeId);
			}
			
			leavebal.setELBalance(finalELLeave);
			leavebal.setCLBalance(finalCLLeave);
			
			LeaveBalanceLocalServiceUtil.updateLeaveBalance(leavebal);
			}
			
			/*}	*/
		
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
