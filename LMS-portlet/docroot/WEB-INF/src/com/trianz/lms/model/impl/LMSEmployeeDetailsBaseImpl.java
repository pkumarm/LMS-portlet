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

import com.trianz.lms.model.LMSEmployeeDetails;
import com.trianz.lms.service.LMSEmployeeDetailsLocalServiceUtil;

/**
 * The extended model base implementation for the LMSEmployeeDetails service. Represents a row in the &quot;LMSEmployeeDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LMSEmployeeDetailsImpl}.
 * </p>
 *
 * @author
 * @see LMSEmployeeDetailsImpl
 * @see com.trianz.lms.model.LMSEmployeeDetails
 * @generated
 */
public abstract class LMSEmployeeDetailsBaseImpl
	extends LMSEmployeeDetailsModelImpl implements LMSEmployeeDetails {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l m s employee details model instance should use the {@link LMSEmployeeDetails} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LMSEmployeeDetailsLocalServiceUtil.addLMSEmployeeDetails(this);
		}
		else {
			LMSEmployeeDetailsLocalServiceUtil.updateLMSEmployeeDetails(this);
		}
	}
}