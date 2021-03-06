/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.trianz.lms.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LMSProjectDetails service. Represents a row in the &quot;LMSProjectDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.trianz.lms.model.impl.LMSProjectDetailsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.trianz.lms.model.impl.LMSProjectDetailsImpl}.
 * </p>
 *
 * @author
 * @see LMSProjectDetails
 * @see com.trianz.lms.model.impl.LMSProjectDetailsImpl
 * @see com.trianz.lms.model.impl.LMSProjectDetailsModelImpl
 * @generated
 */
public interface LMSProjectDetailsModel extends BaseModel<LMSProjectDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a l m s project details model instance should use the {@link LMSProjectDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this l m s project details.
	 *
	 * @return the primary key of this l m s project details
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this l m s project details.
	 *
	 * @param primaryKey the primary key of this l m s project details
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the employee ID of this l m s project details.
	 *
	 * @return the employee ID of this l m s project details
	 */
	public int getEmployeeId();

	/**
	 * Sets the employee ID of this l m s project details.
	 *
	 * @param EmployeeId the employee ID of this l m s project details
	 */
	public void setEmployeeId(int EmployeeId);

	/**
	 * Returns the project code of this l m s project details.
	 *
	 * @return the project code of this l m s project details
	 */
	@AutoEscape
	public String getProjectCode();

	/**
	 * Sets the project code of this l m s project details.
	 *
	 * @param ProjectCode the project code of this l m s project details
	 */
	public void setProjectCode(String ProjectCode);

	/**
	 * Returns the project name of this l m s project details.
	 *
	 * @return the project name of this l m s project details
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this l m s project details.
	 *
	 * @param ProjectName the project name of this l m s project details
	 */
	public void setProjectName(String ProjectName);

	/**
	 * Returns the approver name of this l m s project details.
	 *
	 * @return the approver name of this l m s project details
	 */
	@AutoEscape
	public String getApproverName();

	/**
	 * Sets the approver name of this l m s project details.
	 *
	 * @param ApproverName the approver name of this l m s project details
	 */
	public void setApproverName(String ApproverName);

	/**
	 * Returns the approver i d of this l m s project details.
	 *
	 * @return the approver i d of this l m s project details
	 */
	public int getApproverID();

	/**
	 * Sets the approver i d of this l m s project details.
	 *
	 * @param ApproverID the approver i d of this l m s project details
	 */
	public void setApproverID(int ApproverID);

	/**
	 * Returns the approver email of this l m s project details.
	 *
	 * @return the approver email of this l m s project details
	 */
	@AutoEscape
	public String getApproverEmail();

	/**
	 * Sets the approver email of this l m s project details.
	 *
	 * @param ApproverEmail the approver email of this l m s project details
	 */
	public void setApproverEmail(String ApproverEmail);

	/**
	 * Returns the assignment i d of this l m s project details.
	 *
	 * @return the assignment i d of this l m s project details
	 */
	public int getAssignmentID();

	/**
	 * Sets the assignment i d of this l m s project details.
	 *
	 * @param AssignmentID the assignment i d of this l m s project details
	 */
	public void setAssignmentID(int AssignmentID);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LMSProjectDetails lmsProjectDetails);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LMSProjectDetails> toCacheModel();

	@Override
	public LMSProjectDetails toEscapedModel();

	@Override
	public LMSProjectDetails toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}