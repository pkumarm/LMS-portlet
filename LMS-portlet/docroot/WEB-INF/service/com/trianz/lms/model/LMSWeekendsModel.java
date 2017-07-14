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
 * The base model interface for the LMSWeekends service. Represents a row in the &quot;LMSWeekends&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.trianz.lms.model.impl.LMSWeekendsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.trianz.lms.model.impl.LMSWeekendsImpl}.
 * </p>
 *
 * @author
 * @see LMSWeekends
 * @see com.trianz.lms.model.impl.LMSWeekendsImpl
 * @see com.trianz.lms.model.impl.LMSWeekendsModelImpl
 * @generated
 */
public interface LMSWeekendsModel extends BaseModel<LMSWeekends> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a l m s weekends model instance should use the {@link LMSWeekends} interface instead.
	 */

	/**
	 * Returns the primary key of this l m s weekends.
	 *
	 * @return the primary key of this l m s weekends
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this l m s weekends.
	 *
	 * @param primaryKey the primary key of this l m s weekends
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the location ID of this l m s weekends.
	 *
	 * @return the location ID of this l m s weekends
	 */
	public int getLocationId();

	/**
	 * Sets the location ID of this l m s weekends.
	 *
	 * @param LocationId the location ID of this l m s weekends
	 */
	public void setLocationId(int LocationId);

	/**
	 * Returns the location of this l m s weekends.
	 *
	 * @return the location of this l m s weekends
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this l m s weekends.
	 *
	 * @param Location the location of this l m s weekends
	 */
	public void setLocation(String Location);

	/**
	 * Returns the weekend days of this l m s weekends.
	 *
	 * @return the weekend days of this l m s weekends
	 */
	@AutoEscape
	public String getWeekendDays();

	/**
	 * Sets the weekend days of this l m s weekends.
	 *
	 * @param WeekendDays the weekend days of this l m s weekends
	 */
	public void setWeekendDays(String WeekendDays);

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
	public int compareTo(LMSWeekends lmsWeekends);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LMSWeekends> toCacheModel();

	@Override
	public LMSWeekends toEscapedModel();

	@Override
	public LMSWeekends toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}