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

package com.trianz.lms.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.trianz.lms.model.LMSHolidays;
import com.trianz.lms.service.LMSHolidaysLocalServiceUtil;

/**
 * The extended model base implementation for the LMSHolidays service. Represents a row in the &quot;LMSHolidays&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LMSHolidaysImpl}.
 * </p>
 *
 * @author
 * @see LMSHolidaysImpl
 * @see com.trianz.lms.model.LMSHolidays
 * @generated
 */
public abstract class LMSHolidaysBaseImpl extends LMSHolidaysModelImpl
	implements LMSHolidays {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l m s holidays model instance should use the {@link LMSHolidays} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LMSHolidaysLocalServiceUtil.addLMSHolidays(this);
		}
		else {
			LMSHolidaysLocalServiceUtil.updateLMSHolidays(this);
		}
	}
}