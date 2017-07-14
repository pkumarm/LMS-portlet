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
 * The base model interface for the LMSLeaveType service. Represents a row in the &quot;LMSLeaveType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.trianz.lms.model.impl.LMSLeaveTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.trianz.lms.model.impl.LMSLeaveTypeImpl}.
 * </p>
 *
 * @author
 * @see LMSLeaveType
 * @see com.trianz.lms.model.impl.LMSLeaveTypeImpl
 * @see com.trianz.lms.model.impl.LMSLeaveTypeModelImpl
 * @generated
 */
public interface LMSLeaveTypeModel extends BaseModel<LMSLeaveType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a l m s leave type model instance should use the {@link LMSLeaveType} interface instead.
	 */

	/**
	 * Returns the primary key of this l m s leave type.
	 *
	 * @return the primary key of this l m s leave type
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this l m s leave type.
	 *
	 * @param primaryKey the primary key of this l m s leave type
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the leave type code of this l m s leave type.
	 *
	 * @return the leave type code of this l m s leave type
	 */
	public int getLeaveTypeCode();

	/**
	 * Sets the leave type code of this l m s leave type.
	 *
	 * @param LeaveTypeCode the leave type code of this l m s leave type
	 */
	public void setLeaveTypeCode(int LeaveTypeCode);

	/**
	 * Returns the leave type name of this l m s leave type.
	 *
	 * @return the leave type name of this l m s leave type
	 */
	@AutoEscape
	public String getLeaveTypeName();

	/**
	 * Sets the leave type name of this l m s leave type.
	 *
	 * @param LeaveTypeName the leave type name of this l m s leave type
	 */
	public void setLeaveTypeName(String LeaveTypeName);

	/**
	 * Returns the countries applicable of this l m s leave type.
	 *
	 * @return the countries applicable of this l m s leave type
	 */
	@AutoEscape
	public String getCountriesApplicable();

	/**
	 * Sets the countries applicable of this l m s leave type.
	 *
	 * @param CountriesApplicable the countries applicable of this l m s leave type
	 */
	public void setCountriesApplicable(String CountriesApplicable);

	/**
	 * Returns the monthly accrual of this l m s leave type.
	 *
	 * @return the monthly accrual of this l m s leave type
	 */
	@AutoEscape
	public String getMonthlyAccrual();

	/**
	 * Sets the monthly accrual of this l m s leave type.
	 *
	 * @param MonthlyAccrual the monthly accrual of this l m s leave type
	 */
	public void setMonthlyAccrual(String MonthlyAccrual);

	/**
	 * Returns the accrual value of this l m s leave type.
	 *
	 * @return the accrual value of this l m s leave type
	 */
	public double getAccrualValue();

	/**
	 * Sets the accrual value of this l m s leave type.
	 *
	 * @param AccrualValue the accrual value of this l m s leave type
	 */
	public void setAccrualValue(double AccrualValue);

	/**
	 * Returns the credit reset of this l m s leave type.
	 *
	 * @return the credit reset of this l m s leave type
	 */
	@AutoEscape
	public String getCreditReset();

	/**
	 * Sets the credit reset of this l m s leave type.
	 *
	 * @param CreditReset the credit reset of this l m s leave type
	 */
	public void setCreditReset(String CreditReset);

	/**
	 * Returns the reset interval of this l m s leave type.
	 *
	 * @return the reset interval of this l m s leave type
	 */
	@AutoEscape
	public String getResetInterval();

	/**
	 * Sets the reset interval of this l m s leave type.
	 *
	 * @param ResetInterval the reset interval of this l m s leave type
	 */
	public void setResetInterval(String ResetInterval);

	/**
	 * Returns the reset day of this l m s leave type.
	 *
	 * @return the reset day of this l m s leave type
	 */
	public int getResetDay();

	/**
	 * Sets the reset day of this l m s leave type.
	 *
	 * @param ResetDay the reset day of this l m s leave type
	 */
	public void setResetDay(int ResetDay);

	/**
	 * Returns the exclude week ends of this l m s leave type.
	 *
	 * @return the exclude week ends of this l m s leave type
	 */
	@AutoEscape
	public String getExcludeWeekEnds();

	/**
	 * Sets the exclude week ends of this l m s leave type.
	 *
	 * @param ExcludeWeekEnds the exclude week ends of this l m s leave type
	 */
	public void setExcludeWeekEnds(String ExcludeWeekEnds);

	/**
	 * Returns the exclude holidays of this l m s leave type.
	 *
	 * @return the exclude holidays of this l m s leave type
	 */
	@AutoEscape
	public String getExcludeHolidays();

	/**
	 * Sets the exclude holidays of this l m s leave type.
	 *
	 * @param ExcludeHolidays the exclude holidays of this l m s leave type
	 */
	public void setExcludeHolidays(String ExcludeHolidays);

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
	public int compareTo(LMSLeaveType lmsLeaveType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LMSLeaveType> toCacheModel();

	@Override
	public LMSLeaveType toEscapedModel();

	@Override
	public LMSLeaveType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}