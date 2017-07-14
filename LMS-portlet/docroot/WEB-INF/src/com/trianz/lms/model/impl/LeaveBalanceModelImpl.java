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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.trianz.lms.model.LeaveBalance;
import com.trianz.lms.model.LeaveBalanceModel;
import com.trianz.lms.model.LeaveBalanceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LeaveBalance service. Represents a row in the &quot;LeaveBalance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.trianz.lms.model.LeaveBalanceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveBalanceImpl}.
 * </p>
 *
 * @author
 * @see LeaveBalanceImpl
 * @see com.trianz.lms.model.LeaveBalance
 * @see com.trianz.lms.model.LeaveBalanceModel
 * @generated
 */
@JSON(strict = true)
public class LeaveBalanceModelImpl extends BaseModelImpl<LeaveBalance>
	implements LeaveBalanceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave balance model instance should use the {@link com.trianz.lms.model.LeaveBalance} interface instead.
	 */
	public static final String TABLE_NAME = "LeaveBalance";
	public static final Object[][] TABLE_COLUMNS = {
			{ "EmployeeId", Types.INTEGER },
			{ "ELBalance", Types.DOUBLE },
			{ "CLBalance", Types.DOUBLE },
			{ "CompOffLeaveBalance", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table LeaveBalance (EmployeeId INTEGER not null primary key,ELBalance DOUBLE,CLBalance DOUBLE,CompOffLeaveBalance DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table LeaveBalance";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveBalance.EmployeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LeaveBalance.EmployeeId ASC";
	public static final String DATA_SOURCE = "devDS";
	public static final String SESSION_FACTORY = "devSessionFactory";
	public static final String TX_MANAGER = "devTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.trianz.lms.model.LeaveBalance"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.trianz.lms.model.LeaveBalance"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.trianz.lms.model.LeaveBalance"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LeaveBalance toModel(LeaveBalanceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LeaveBalance model = new LeaveBalanceImpl();

		model.setEmployeeId(soapModel.getEmployeeId());
		model.setELBalance(soapModel.getELBalance());
		model.setCLBalance(soapModel.getCLBalance());
		model.setCompOffLeaveBalance(soapModel.getCompOffLeaveBalance());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LeaveBalance> toModels(LeaveBalanceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LeaveBalance> models = new ArrayList<LeaveBalance>(soapModels.length);

		for (LeaveBalanceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.trianz.lms.model.LeaveBalance"));

	public LeaveBalanceModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _EmployeeId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setEmployeeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _EmployeeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveBalance.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveBalance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("EmployeeId", getEmployeeId());
		attributes.put("ELBalance", getELBalance());
		attributes.put("CLBalance", getCLBalance());
		attributes.put("CompOffLeaveBalance", getCompOffLeaveBalance());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer EmployeeId = (Integer)attributes.get("EmployeeId");

		if (EmployeeId != null) {
			setEmployeeId(EmployeeId);
		}

		Double ELBalance = (Double)attributes.get("ELBalance");

		if (ELBalance != null) {
			setELBalance(ELBalance);
		}

		Double CLBalance = (Double)attributes.get("CLBalance");

		if (CLBalance != null) {
			setCLBalance(CLBalance);
		}

		Double CompOffLeaveBalance = (Double)attributes.get(
				"CompOffLeaveBalance");

		if (CompOffLeaveBalance != null) {
			setCompOffLeaveBalance(CompOffLeaveBalance);
		}
	}

	@JSON
	@Override
	public int getEmployeeId() {
		return _EmployeeId;
	}

	@Override
	public void setEmployeeId(int EmployeeId) {
		_columnBitmask = -1L;

		if (!_setOriginalEmployeeId) {
			_setOriginalEmployeeId = true;

			_originalEmployeeId = _EmployeeId;
		}

		_EmployeeId = EmployeeId;
	}

	public int getOriginalEmployeeId() {
		return _originalEmployeeId;
	}

	@JSON
	@Override
	public double getELBalance() {
		return _ELBalance;
	}

	@Override
	public void setELBalance(double ELBalance) {
		_ELBalance = ELBalance;
	}

	@JSON
	@Override
	public double getCLBalance() {
		return _CLBalance;
	}

	@Override
	public void setCLBalance(double CLBalance) {
		_CLBalance = CLBalance;
	}

	@JSON
	@Override
	public double getCompOffLeaveBalance() {
		return _CompOffLeaveBalance;
	}

	@Override
	public void setCompOffLeaveBalance(double CompOffLeaveBalance) {
		_CompOffLeaveBalance = CompOffLeaveBalance;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LeaveBalance toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveBalance)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveBalanceImpl leaveBalanceImpl = new LeaveBalanceImpl();

		leaveBalanceImpl.setEmployeeId(getEmployeeId());
		leaveBalanceImpl.setELBalance(getELBalance());
		leaveBalanceImpl.setCLBalance(getCLBalance());
		leaveBalanceImpl.setCompOffLeaveBalance(getCompOffLeaveBalance());

		leaveBalanceImpl.resetOriginalValues();

		return leaveBalanceImpl;
	}

	@Override
	public int compareTo(LeaveBalance leaveBalance) {
		int value = 0;

		if (getEmployeeId() < leaveBalance.getEmployeeId()) {
			value = -1;
		}
		else if (getEmployeeId() > leaveBalance.getEmployeeId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveBalance)) {
			return false;
		}

		LeaveBalance leaveBalance = (LeaveBalance)obj;

		int primaryKey = leaveBalance.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LeaveBalanceModelImpl leaveBalanceModelImpl = this;

		leaveBalanceModelImpl._originalEmployeeId = leaveBalanceModelImpl._EmployeeId;

		leaveBalanceModelImpl._setOriginalEmployeeId = false;

		leaveBalanceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveBalance> toCacheModel() {
		LeaveBalanceCacheModel leaveBalanceCacheModel = new LeaveBalanceCacheModel();

		leaveBalanceCacheModel.EmployeeId = getEmployeeId();

		leaveBalanceCacheModel.ELBalance = getELBalance();

		leaveBalanceCacheModel.CLBalance = getCLBalance();

		leaveBalanceCacheModel.CompOffLeaveBalance = getCompOffLeaveBalance();

		return leaveBalanceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{EmployeeId=");
		sb.append(getEmployeeId());
		sb.append(", ELBalance=");
		sb.append(getELBalance());
		sb.append(", CLBalance=");
		sb.append(getCLBalance());
		sb.append(", CompOffLeaveBalance=");
		sb.append(getCompOffLeaveBalance());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.trianz.lms.model.LeaveBalance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>EmployeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ELBalance</column-name><column-value><![CDATA[");
		sb.append(getELBalance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CLBalance</column-name><column-value><![CDATA[");
		sb.append(getCLBalance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CompOffLeaveBalance</column-name><column-value><![CDATA[");
		sb.append(getCompOffLeaveBalance());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveBalance.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveBalance.class
		};
	private int _EmployeeId;
	private int _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private double _ELBalance;
	private double _CLBalance;
	private double _CompOffLeaveBalance;
	private long _columnBitmask;
	private LeaveBalance _escapedModel;
}