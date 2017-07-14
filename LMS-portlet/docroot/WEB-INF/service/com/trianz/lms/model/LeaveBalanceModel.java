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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LeaveBalance service. Represents a row in the &quot;LeaveBalance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.trianz.lms.model.impl.LeaveBalanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.trianz.lms.model.impl.LeaveBalanceImpl}.
 * </p>
 *
 * @author
 * @see LeaveBalance
 * @see com.trianz.lms.model.impl.LeaveBalanceImpl
 * @see com.trianz.lms.model.impl.LeaveBalanceModelImpl
 * @generated
 */
public interface LeaveBalanceModel extends BaseModel<LeaveBalance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leave balance model instance should use the {@link LeaveBalance} interface instead.
	 */

	/**
	 * Returns the primary key of this leave balance.
	 *
	 * @return the primary key of this leave balance
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this leave balance.
	 *
	 * @param primaryKey the primary key of this leave balance
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the employee ID of this leave balance.
	 *
	 * @return the employee ID of this leave balance
	 */
	public int getEmployeeId();

	/**
	 * Sets the employee ID of this leave balance.
	 *
	 * @param EmployeeId the employee ID of this leave balance
	 */
	public void setEmployeeId(int EmployeeId);

	/**
	 * Returns the e l balance of this leave balance.
	 *
	 * @return the e l balance of this leave balance
	 */
	public double getELBalance();

	/**
	 * Sets the e l balance of this leave balance.
	 *
	 * @param ELBalance the e l balance of this leave balance
	 */
	public void setELBalance(double ELBalance);

	/**
	 * Returns the c l balance of this leave balance.
	 *
	 * @return the c l balance of this leave balance
	 */
	public double getCLBalance();

	/**
	 * Sets the c l balance of this leave balance.
	 *
	 * @param CLBalance the c l balance of this leave balance
	 */
	public void setCLBalance(double CLBalance);

	/**
	 * Returns the comp off leave balance of this leave balance.
	 *
	 * @return the comp off leave balance of this leave balance
	 */
	public double getCompOffLeaveBalance();

	/**
	 * Sets the comp off leave balance of this leave balance.
	 *
	 * @param CompOffLeaveBalance the comp off leave balance of this leave balance
	 */
	public void setCompOffLeaveBalance(double CompOffLeaveBalance);

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
	public int compareTo(LeaveBalance leaveBalance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LeaveBalance> toCacheModel();

	@Override
	public LeaveBalance toEscapedModel();

	@Override
	public LeaveBalance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}