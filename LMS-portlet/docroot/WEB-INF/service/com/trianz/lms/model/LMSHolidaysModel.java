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

import java.util.Date;

/**
 * The base model interface for the LMSHolidays service. Represents a row in the &quot;LMSHolidays&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.trianz.lms.model.impl.LMSHolidaysModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.trianz.lms.model.impl.LMSHolidaysImpl}.
 * </p>
 *
 * @author
 * @see LMSHolidays
 * @see com.trianz.lms.model.impl.LMSHolidaysImpl
 * @see com.trianz.lms.model.impl.LMSHolidaysModelImpl
 * @generated
 */
public interface LMSHolidaysModel extends BaseModel<LMSHolidays> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a l m s holidays model instance should use the {@link LMSHolidays} interface instead.
	 */

	/**
	 * Returns the primary key of this l m s holidays.
	 *
	 * @return the primary key of this l m s holidays
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this l m s holidays.
	 *
	 * @param primaryKey the primary key of this l m s holidays
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the holiday ID of this l m s holidays.
	 *
	 * @return the holiday ID of this l m s holidays
	 */
	public int getHolidayId();

	/**
	 * Sets the holiday ID of this l m s holidays.
	 *
	 * @param HolidayId the holiday ID of this l m s holidays
	 */
	public void setHolidayId(int HolidayId);

	/**
	 * Returns the holiday date of this l m s holidays.
	 *
	 * @return the holiday date of this l m s holidays
	 */
	public Date getHolidayDate();

	/**
	 * Sets the holiday date of this l m s holidays.
	 *
	 * @param HolidayDate the holiday date of this l m s holidays
	 */
	public void setHolidayDate(Date HolidayDate);

	/**
	 * Returns the occassion of this l m s holidays.
	 *
	 * @return the occassion of this l m s holidays
	 */
	@AutoEscape
	public String getOccassion();

	/**
	 * Sets the occassion of this l m s holidays.
	 *
	 * @param Occassion the occassion of this l m s holidays
	 */
	public void setOccassion(String Occassion);

	/**
	 * Returns the holiday year of this l m s holidays.
	 *
	 * @return the holiday year of this l m s holidays
	 */
	public int getHolidayYear();

	/**
	 * Sets the holiday year of this l m s holidays.
	 *
	 * @param HolidayYear the holiday year of this l m s holidays
	 */
	public void setHolidayYear(int HolidayYear);

	/**
	 * Returns the locations applicable of this l m s holidays.
	 *
	 * @return the locations applicable of this l m s holidays
	 */
	@AutoEscape
	public String getLocationsApplicable();

	/**
	 * Sets the locations applicable of this l m s holidays.
	 *
	 * @param LocationsApplicable the locations applicable of this l m s holidays
	 */
	public void setLocationsApplicable(String LocationsApplicable);

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
	public int compareTo(LMSHolidays lmsHolidays);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LMSHolidays> toCacheModel();

	@Override
	public LMSHolidays toEscapedModel();

	@Override
	public LMSHolidays toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}