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

import com.trianz.lms.model.securaxEmployeeHrs;
import com.trianz.lms.model.securaxEmployeeHrsModel;
import com.trianz.lms.model.securaxEmployeeHrsSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the securaxEmployeeHrs service. Represents a row in the &quot;securaxEmployeeHrs&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.trianz.lms.model.securaxEmployeeHrsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link securaxEmployeeHrsImpl}.
 * </p>
 *
 * @author
 * @see securaxEmployeeHrsImpl
 * @see com.trianz.lms.model.securaxEmployeeHrs
 * @see com.trianz.lms.model.securaxEmployeeHrsModel
 * @generated
 */
@JSON(strict = true)
public class securaxEmployeeHrsModelImpl extends BaseModelImpl<securaxEmployeeHrs>
	implements securaxEmployeeHrsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a securax employee hrs model instance should use the {@link com.trianz.lms.model.securaxEmployeeHrs} interface instead.
	 */
	public static final String TABLE_NAME = "securaxEmployeeHrs";
	public static final Object[][] TABLE_COLUMNS = {
			{ "EmployeeId", Types.INTEGER },
			{ "PunchDate", Types.TIMESTAMP },
			{ "PunchInTime", Types.TIMESTAMP },
			{ "PunchOutTime", Types.TIMESTAMP },
			{ "WorkHrsPerday", Types.TIMESTAMP },
			{ "Status", Types.VARCHAR },
			{ "OT", Types.TIMESTAMP },
			{ "Created_By", Types.INTEGER },
			{ "Created_Date", Types.TIMESTAMP },
			{ "Modified_By", Types.INTEGER },
			{ "Modified_Date", Types.TIMESTAMP },
			{ "S_Id", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table securaxEmployeeHrs (EmployeeId INTEGER not null primary key IDENTITY,PunchDate DATE null,PunchInTime DATE null,PunchOutTime DATE null,WorkHrsPerday DATE null,Status VARCHAR(75) null,OT DATE null,Created_By INTEGER,Created_Date DATE null,Modified_By INTEGER,Modified_Date DATE null,S_Id INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table securaxEmployeeHrs";
	public static final String ORDER_BY_JPQL = " ORDER BY securaxEmployeeHrs.EmployeeId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY securaxEmployeeHrs.EmployeeId ASC";
	public static final String DATA_SOURCE = "devDS";
	public static final String SESSION_FACTORY = "devSessionFactory";
	public static final String TX_MANAGER = "devTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.trianz.lms.model.securaxEmployeeHrs"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.trianz.lms.model.securaxEmployeeHrs"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.trianz.lms.model.securaxEmployeeHrs"),
			true);
	public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
	public static long PUNCHDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static securaxEmployeeHrs toModel(securaxEmployeeHrsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		securaxEmployeeHrs model = new securaxEmployeeHrsImpl();

		model.setEmployeeId(soapModel.getEmployeeId());
		model.setPunchDate(soapModel.getPunchDate());
		model.setPunchInTime(soapModel.getPunchInTime());
		model.setPunchOutTime(soapModel.getPunchOutTime());
		model.setWorkHrsPerday(soapModel.getWorkHrsPerday());
		model.setStatus(soapModel.getStatus());
		model.setOT(soapModel.getOT());
		model.setCreated_By(soapModel.getCreated_By());
		model.setCreated_Date(soapModel.getCreated_Date());
		model.setModified_By(soapModel.getModified_By());
		model.setModified_Date(soapModel.getModified_Date());
		model.setS_Id(soapModel.getS_Id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<securaxEmployeeHrs> toModels(
		securaxEmployeeHrsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<securaxEmployeeHrs> models = new ArrayList<securaxEmployeeHrs>(soapModels.length);

		for (securaxEmployeeHrsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.trianz.lms.model.securaxEmployeeHrs"));

	public securaxEmployeeHrsModelImpl() {
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
		return securaxEmployeeHrs.class;
	}

	@Override
	public String getModelClassName() {
		return securaxEmployeeHrs.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("EmployeeId", getEmployeeId());
		attributes.put("PunchDate", getPunchDate());
		attributes.put("PunchInTime", getPunchInTime());
		attributes.put("PunchOutTime", getPunchOutTime());
		attributes.put("WorkHrsPerday", getWorkHrsPerday());
		attributes.put("Status", getStatus());
		attributes.put("OT", getOT());
		attributes.put("Created_By", getCreated_By());
		attributes.put("Created_Date", getCreated_Date());
		attributes.put("Modified_By", getModified_By());
		attributes.put("Modified_Date", getModified_Date());
		attributes.put("S_Id", getS_Id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer EmployeeId = (Integer)attributes.get("EmployeeId");

		if (EmployeeId != null) {
			setEmployeeId(EmployeeId);
		}

		Date PunchDate = (Date)attributes.get("PunchDate");

		if (PunchDate != null) {
			setPunchDate(PunchDate);
		}

		Date PunchInTime = (Date)attributes.get("PunchInTime");

		if (PunchInTime != null) {
			setPunchInTime(PunchInTime);
		}

		Date PunchOutTime = (Date)attributes.get("PunchOutTime");

		if (PunchOutTime != null) {
			setPunchOutTime(PunchOutTime);
		}

		Date WorkHrsPerday = (Date)attributes.get("WorkHrsPerday");

		if (WorkHrsPerday != null) {
			setWorkHrsPerday(WorkHrsPerday);
		}

		String Status = (String)attributes.get("Status");

		if (Status != null) {
			setStatus(Status);
		}

		Date OT = (Date)attributes.get("OT");

		if (OT != null) {
			setOT(OT);
		}

		Integer Created_By = (Integer)attributes.get("Created_By");

		if (Created_By != null) {
			setCreated_By(Created_By);
		}

		Date Created_Date = (Date)attributes.get("Created_Date");

		if (Created_Date != null) {
			setCreated_Date(Created_Date);
		}

		Integer Modified_By = (Integer)attributes.get("Modified_By");

		if (Modified_By != null) {
			setModified_By(Modified_By);
		}

		Date Modified_Date = (Date)attributes.get("Modified_Date");

		if (Modified_Date != null) {
			setModified_Date(Modified_Date);
		}

		Integer S_Id = (Integer)attributes.get("S_Id");

		if (S_Id != null) {
			setS_Id(S_Id);
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
	public Date getPunchDate() {
		return _PunchDate;
	}

	@Override
	public void setPunchDate(Date PunchDate) {
		_columnBitmask |= PUNCHDATE_COLUMN_BITMASK;

		if (_originalPunchDate == null) {
			_originalPunchDate = _PunchDate;
		}

		_PunchDate = PunchDate;
	}

	public Date getOriginalPunchDate() {
		return _originalPunchDate;
	}

	@JSON
	@Override
	public Date getPunchInTime() {
		return _PunchInTime;
	}

	@Override
	public void setPunchInTime(Date PunchInTime) {
		_PunchInTime = PunchInTime;
	}

	@JSON
	@Override
	public Date getPunchOutTime() {
		return _PunchOutTime;
	}

	@Override
	public void setPunchOutTime(Date PunchOutTime) {
		_PunchOutTime = PunchOutTime;
	}

	@JSON
	@Override
	public Date getWorkHrsPerday() {
		return _WorkHrsPerday;
	}

	@Override
	public void setWorkHrsPerday(Date WorkHrsPerday) {
		_WorkHrsPerday = WorkHrsPerday;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_Status == null) {
			return StringPool.BLANK;
		}
		else {
			return _Status;
		}
	}

	@Override
	public void setStatus(String Status) {
		_Status = Status;
	}

	@JSON
	@Override
	public Date getOT() {
		return _OT;
	}

	@Override
	public void setOT(Date OT) {
		_OT = OT;
	}

	@JSON
	@Override
	public int getCreated_By() {
		return _Created_By;
	}

	@Override
	public void setCreated_By(int Created_By) {
		_Created_By = Created_By;
	}

	@JSON
	@Override
	public Date getCreated_Date() {
		return _Created_Date;
	}

	@Override
	public void setCreated_Date(Date Created_Date) {
		_Created_Date = Created_Date;
	}

	@JSON
	@Override
	public int getModified_By() {
		return _Modified_By;
	}

	@Override
	public void setModified_By(int Modified_By) {
		_Modified_By = Modified_By;
	}

	@JSON
	@Override
	public Date getModified_Date() {
		return _Modified_Date;
	}

	@Override
	public void setModified_Date(Date Modified_Date) {
		_Modified_Date = Modified_Date;
	}

	@JSON
	@Override
	public int getS_Id() {
		return _S_Id;
	}

	@Override
	public void setS_Id(int S_Id) {
		_S_Id = S_Id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public securaxEmployeeHrs toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (securaxEmployeeHrs)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		securaxEmployeeHrsImpl securaxEmployeeHrsImpl = new securaxEmployeeHrsImpl();

		securaxEmployeeHrsImpl.setEmployeeId(getEmployeeId());
		securaxEmployeeHrsImpl.setPunchDate(getPunchDate());
		securaxEmployeeHrsImpl.setPunchInTime(getPunchInTime());
		securaxEmployeeHrsImpl.setPunchOutTime(getPunchOutTime());
		securaxEmployeeHrsImpl.setWorkHrsPerday(getWorkHrsPerday());
		securaxEmployeeHrsImpl.setStatus(getStatus());
		securaxEmployeeHrsImpl.setOT(getOT());
		securaxEmployeeHrsImpl.setCreated_By(getCreated_By());
		securaxEmployeeHrsImpl.setCreated_Date(getCreated_Date());
		securaxEmployeeHrsImpl.setModified_By(getModified_By());
		securaxEmployeeHrsImpl.setModified_Date(getModified_Date());
		securaxEmployeeHrsImpl.setS_Id(getS_Id());

		securaxEmployeeHrsImpl.resetOriginalValues();

		return securaxEmployeeHrsImpl;
	}

	@Override
	public int compareTo(securaxEmployeeHrs securaxEmployeeHrs) {
		int value = 0;

		if (getEmployeeId() < securaxEmployeeHrs.getEmployeeId()) {
			value = -1;
		}
		else if (getEmployeeId() > securaxEmployeeHrs.getEmployeeId()) {
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

		if (!(obj instanceof securaxEmployeeHrs)) {
			return false;
		}

		securaxEmployeeHrs securaxEmployeeHrs = (securaxEmployeeHrs)obj;

		int primaryKey = securaxEmployeeHrs.getPrimaryKey();

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
		securaxEmployeeHrsModelImpl securaxEmployeeHrsModelImpl = this;

		securaxEmployeeHrsModelImpl._originalEmployeeId = securaxEmployeeHrsModelImpl._EmployeeId;

		securaxEmployeeHrsModelImpl._setOriginalEmployeeId = false;

		securaxEmployeeHrsModelImpl._originalPunchDate = securaxEmployeeHrsModelImpl._PunchDate;

		securaxEmployeeHrsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<securaxEmployeeHrs> toCacheModel() {
		securaxEmployeeHrsCacheModel securaxEmployeeHrsCacheModel = new securaxEmployeeHrsCacheModel();

		securaxEmployeeHrsCacheModel.EmployeeId = getEmployeeId();

		Date PunchDate = getPunchDate();

		if (PunchDate != null) {
			securaxEmployeeHrsCacheModel.PunchDate = PunchDate.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.PunchDate = Long.MIN_VALUE;
		}

		Date PunchInTime = getPunchInTime();

		if (PunchInTime != null) {
			securaxEmployeeHrsCacheModel.PunchInTime = PunchInTime.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.PunchInTime = Long.MIN_VALUE;
		}

		Date PunchOutTime = getPunchOutTime();

		if (PunchOutTime != null) {
			securaxEmployeeHrsCacheModel.PunchOutTime = PunchOutTime.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.PunchOutTime = Long.MIN_VALUE;
		}

		Date WorkHrsPerday = getWorkHrsPerday();

		if (WorkHrsPerday != null) {
			securaxEmployeeHrsCacheModel.WorkHrsPerday = WorkHrsPerday.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.WorkHrsPerday = Long.MIN_VALUE;
		}

		securaxEmployeeHrsCacheModel.Status = getStatus();

		String Status = securaxEmployeeHrsCacheModel.Status;

		if ((Status != null) && (Status.length() == 0)) {
			securaxEmployeeHrsCacheModel.Status = null;
		}

		Date OT = getOT();

		if (OT != null) {
			securaxEmployeeHrsCacheModel.OT = OT.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.OT = Long.MIN_VALUE;
		}

		securaxEmployeeHrsCacheModel.Created_By = getCreated_By();

		Date Created_Date = getCreated_Date();

		if (Created_Date != null) {
			securaxEmployeeHrsCacheModel.Created_Date = Created_Date.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.Created_Date = Long.MIN_VALUE;
		}

		securaxEmployeeHrsCacheModel.Modified_By = getModified_By();

		Date Modified_Date = getModified_Date();

		if (Modified_Date != null) {
			securaxEmployeeHrsCacheModel.Modified_Date = Modified_Date.getTime();
		}
		else {
			securaxEmployeeHrsCacheModel.Modified_Date = Long.MIN_VALUE;
		}

		securaxEmployeeHrsCacheModel.S_Id = getS_Id();

		return securaxEmployeeHrsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{EmployeeId=");
		sb.append(getEmployeeId());
		sb.append(", PunchDate=");
		sb.append(getPunchDate());
		sb.append(", PunchInTime=");
		sb.append(getPunchInTime());
		sb.append(", PunchOutTime=");
		sb.append(getPunchOutTime());
		sb.append(", WorkHrsPerday=");
		sb.append(getWorkHrsPerday());
		sb.append(", Status=");
		sb.append(getStatus());
		sb.append(", OT=");
		sb.append(getOT());
		sb.append(", Created_By=");
		sb.append(getCreated_By());
		sb.append(", Created_Date=");
		sb.append(getCreated_Date());
		sb.append(", Modified_By=");
		sb.append(getModified_By());
		sb.append(", Modified_Date=");
		sb.append(getModified_Date());
		sb.append(", S_Id=");
		sb.append(getS_Id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.trianz.lms.model.securaxEmployeeHrs");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>EmployeeId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PunchDate</column-name><column-value><![CDATA[");
		sb.append(getPunchDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PunchInTime</column-name><column-value><![CDATA[");
		sb.append(getPunchInTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PunchOutTime</column-name><column-value><![CDATA[");
		sb.append(getPunchOutTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>WorkHrsPerday</column-name><column-value><![CDATA[");
		sb.append(getWorkHrsPerday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>OT</column-name><column-value><![CDATA[");
		sb.append(getOT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Created_By</column-name><column-value><![CDATA[");
		sb.append(getCreated_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Created_Date</column-name><column-value><![CDATA[");
		sb.append(getCreated_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Modified_By</column-name><column-value><![CDATA[");
		sb.append(getModified_By());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Modified_Date</column-name><column-value><![CDATA[");
		sb.append(getModified_Date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>S_Id</column-name><column-value><![CDATA[");
		sb.append(getS_Id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = securaxEmployeeHrs.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			securaxEmployeeHrs.class
		};
	private int _EmployeeId;
	private int _originalEmployeeId;
	private boolean _setOriginalEmployeeId;
	private Date _PunchDate;
	private Date _originalPunchDate;
	private Date _PunchInTime;
	private Date _PunchOutTime;
	private Date _WorkHrsPerday;
	private String _Status;
	private Date _OT;
	private int _Created_By;
	private Date _Created_Date;
	private int _Modified_By;
	private Date _Modified_Date;
	private int _S_Id;
	private long _columnBitmask;
	private securaxEmployeeHrs _escapedModel;
}