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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.trianz.lms.model.LeaveInformationAudit;
import com.trianz.lms.model.LeaveInformationAuditModel;
import com.trianz.lms.model.LeaveInformationAuditSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LeaveInformationAudit service. Represents a row in the &quot;LeaveInformationAudit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.trianz.lms.model.LeaveInformationAuditModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveInformationAuditImpl}.
 * </p>
 *
 * @author
 * @see LeaveInformationAuditImpl
 * @see com.trianz.lms.model.LeaveInformationAudit
 * @see com.trianz.lms.model.LeaveInformationAuditModel
 * @generated
 */
@JSON(strict = true)
public class LeaveInformationAuditModelImpl extends BaseModelImpl<LeaveInformationAudit>
	implements LeaveInformationAuditModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave information audit model instance should use the {@link com.trianz.lms.model.LeaveInformationAudit} interface instead.
	 */
	public static final String TABLE_NAME = "LeaveInformationAudit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "LogId", Types.INTEGER },
			{ "LeaveRequestId", Types.INTEGER },
			{ "Action", Types.VARCHAR },
			{ "ActionBy", Types.VARCHAR },
			{ "CreatedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table LeaveInformationAudit (LogId INTEGER not null primary key,LeaveRequestId INTEGER,Action VARCHAR(75) null,ActionBy VARCHAR(75) null,CreatedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table LeaveInformationAudit";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveInformationAudit.LogId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LeaveInformationAudit.LogId ASC";
	public static final String DATA_SOURCE = "devDS";
	public static final String SESSION_FACTORY = "devSessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.trianz.lms.model.LeaveInformationAudit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.trianz.lms.model.LeaveInformationAudit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.trianz.lms.model.LeaveInformationAudit"),
			true);
	public static long LEAVEREQUESTID_COLUMN_BITMASK = 1L;
	public static long LOGID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LeaveInformationAudit toModel(
		LeaveInformationAuditSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LeaveInformationAudit model = new LeaveInformationAuditImpl();

		model.setLogId(soapModel.getLogId());
		model.setLeaveRequestId(soapModel.getLeaveRequestId());
		model.setAction(soapModel.getAction());
		model.setActionBy(soapModel.getActionBy());
		model.setCreatedDate(soapModel.getCreatedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LeaveInformationAudit> toModels(
		LeaveInformationAuditSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LeaveInformationAudit> models = new ArrayList<LeaveInformationAudit>(soapModels.length);

		for (LeaveInformationAuditSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.trianz.lms.model.LeaveInformationAudit"));

	public LeaveInformationAuditModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _LogId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _LogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveInformationAudit.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveInformationAudit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LogId", getLogId());
		attributes.put("LeaveRequestId", getLeaveRequestId());
		attributes.put("Action", getAction());
		attributes.put("ActionBy", getActionBy());
		attributes.put("CreatedDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer LogId = (Integer)attributes.get("LogId");

		if (LogId != null) {
			setLogId(LogId);
		}

		Integer LeaveRequestId = (Integer)attributes.get("LeaveRequestId");

		if (LeaveRequestId != null) {
			setLeaveRequestId(LeaveRequestId);
		}

		String Action = (String)attributes.get("Action");

		if (Action != null) {
			setAction(Action);
		}

		String ActionBy = (String)attributes.get("ActionBy");

		if (ActionBy != null) {
			setActionBy(ActionBy);
		}

		Date CreatedDate = (Date)attributes.get("CreatedDate");

		if (CreatedDate != null) {
			setCreatedDate(CreatedDate);
		}
	}

	@JSON
	@Override
	public int getLogId() {
		return _LogId;
	}

	@Override
	public void setLogId(int LogId) {
		_LogId = LogId;
	}

	@JSON
	@Override
	public int getLeaveRequestId() {
		return _LeaveRequestId;
	}

	@Override
	public void setLeaveRequestId(int LeaveRequestId) {
		_columnBitmask |= LEAVEREQUESTID_COLUMN_BITMASK;

		if (!_setOriginalLeaveRequestId) {
			_setOriginalLeaveRequestId = true;

			_originalLeaveRequestId = _LeaveRequestId;
		}

		_LeaveRequestId = LeaveRequestId;
	}

	public int getOriginalLeaveRequestId() {
		return _originalLeaveRequestId;
	}

	@JSON
	@Override
	public String getAction() {
		if (_Action == null) {
			return StringPool.BLANK;
		}
		else {
			return _Action;
		}
	}

	@Override
	public void setAction(String Action) {
		_Action = Action;
	}

	@JSON
	@Override
	public String getActionBy() {
		if (_ActionBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _ActionBy;
		}
	}

	@Override
	public void setActionBy(String ActionBy) {
		_ActionBy = ActionBy;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _CreatedDate;
	}

	@Override
	public void setCreatedDate(Date CreatedDate) {
		_CreatedDate = CreatedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LeaveInformationAudit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveInformationAudit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveInformationAuditImpl leaveInformationAuditImpl = new LeaveInformationAuditImpl();

		leaveInformationAuditImpl.setLogId(getLogId());
		leaveInformationAuditImpl.setLeaveRequestId(getLeaveRequestId());
		leaveInformationAuditImpl.setAction(getAction());
		leaveInformationAuditImpl.setActionBy(getActionBy());
		leaveInformationAuditImpl.setCreatedDate(getCreatedDate());

		leaveInformationAuditImpl.resetOriginalValues();

		return leaveInformationAuditImpl;
	}

	@Override
	public int compareTo(LeaveInformationAudit leaveInformationAudit) {
		int primaryKey = leaveInformationAudit.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveInformationAudit)) {
			return false;
		}

		LeaveInformationAudit leaveInformationAudit = (LeaveInformationAudit)obj;

		int primaryKey = leaveInformationAudit.getPrimaryKey();

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
		LeaveInformationAuditModelImpl leaveInformationAuditModelImpl = this;

		leaveInformationAuditModelImpl._originalLeaveRequestId = leaveInformationAuditModelImpl._LeaveRequestId;

		leaveInformationAuditModelImpl._setOriginalLeaveRequestId = false;

		leaveInformationAuditModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveInformationAudit> toCacheModel() {
		LeaveInformationAuditCacheModel leaveInformationAuditCacheModel = new LeaveInformationAuditCacheModel();

		leaveInformationAuditCacheModel.LogId = getLogId();

		leaveInformationAuditCacheModel.LeaveRequestId = getLeaveRequestId();

		leaveInformationAuditCacheModel.Action = getAction();

		String Action = leaveInformationAuditCacheModel.Action;

		if ((Action != null) && (Action.length() == 0)) {
			leaveInformationAuditCacheModel.Action = null;
		}

		leaveInformationAuditCacheModel.ActionBy = getActionBy();

		String ActionBy = leaveInformationAuditCacheModel.ActionBy;

		if ((ActionBy != null) && (ActionBy.length() == 0)) {
			leaveInformationAuditCacheModel.ActionBy = null;
		}

		Date CreatedDate = getCreatedDate();

		if (CreatedDate != null) {
			leaveInformationAuditCacheModel.CreatedDate = CreatedDate.getTime();
		}
		else {
			leaveInformationAuditCacheModel.CreatedDate = Long.MIN_VALUE;
		}

		return leaveInformationAuditCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{LogId=");
		sb.append(getLogId());
		sb.append(", LeaveRequestId=");
		sb.append(getLeaveRequestId());
		sb.append(", Action=");
		sb.append(getAction());
		sb.append(", ActionBy=");
		sb.append(getActionBy());
		sb.append(", CreatedDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.trianz.lms.model.LeaveInformationAudit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>LogId</column-name><column-value><![CDATA[");
		sb.append(getLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LeaveRequestId</column-name><column-value><![CDATA[");
		sb.append(getLeaveRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Action</column-name><column-value><![CDATA[");
		sb.append(getAction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ActionBy</column-name><column-value><![CDATA[");
		sb.append(getActionBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>CreatedDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveInformationAudit.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveInformationAudit.class
		};
	private int _LogId;
	private int _LeaveRequestId;
	private int _originalLeaveRequestId;
	private boolean _setOriginalLeaveRequestId;
	private String _Action;
	private String _ActionBy;
	private Date _CreatedDate;
	private long _columnBitmask;
	private LeaveInformationAudit _escapedModel;
}