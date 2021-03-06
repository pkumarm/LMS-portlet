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

import com.trianz.lms.model.LeaveCategories;
import com.trianz.lms.model.LeaveCategoriesModel;
import com.trianz.lms.model.LeaveCategoriesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LeaveCategories service. Represents a row in the &quot;LeaveCategories&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.trianz.lms.model.LeaveCategoriesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveCategoriesImpl}.
 * </p>
 *
 * @author
 * @see LeaveCategoriesImpl
 * @see com.trianz.lms.model.LeaveCategories
 * @see com.trianz.lms.model.LeaveCategoriesModel
 * @generated
 */
@JSON(strict = true)
public class LeaveCategoriesModelImpl extends BaseModelImpl<LeaveCategories>
	implements LeaveCategoriesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave categories model instance should use the {@link com.trianz.lms.model.LeaveCategories} interface instead.
	 */
	public static final String TABLE_NAME = "LeaveCategories";
	public static final Object[][] TABLE_COLUMNS = {
			{ "LeaveCategoryCode", Types.VARCHAR },
			{ "LeaveCategory", Types.VARCHAR },
			{ "LeaveTypeCode", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table LeaveCategories (LeaveCategoryCode VARCHAR(75) null,LeaveCategory VARCHAR(75) null,LeaveTypeCode INTEGER not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table LeaveCategories";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveCategories.LeaveCategoryCode ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LeaveCategories.LeaveCategoryCode ASC";
	public static final String DATA_SOURCE = "devDS";
	public static final String SESSION_FACTORY = "devSessionFactory";
	public static final String TX_MANAGER = "devTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.trianz.lms.model.LeaveCategories"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.trianz.lms.model.LeaveCategories"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.trianz.lms.model.LeaveCategories"),
			true);
	public static long LEAVECATEGORY_COLUMN_BITMASK = 1L;
	public static long LEAVECATEGORYCODE_COLUMN_BITMASK = 2L;
	public static long LEAVETYPECODE_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LeaveCategories toModel(LeaveCategoriesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LeaveCategories model = new LeaveCategoriesImpl();

		model.setLeaveCategoryCode(soapModel.getLeaveCategoryCode());
		model.setLeaveCategory(soapModel.getLeaveCategory());
		model.setLeaveTypeCode(soapModel.getLeaveTypeCode());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LeaveCategories> toModels(
		LeaveCategoriesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LeaveCategories> models = new ArrayList<LeaveCategories>(soapModels.length);

		for (LeaveCategoriesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.trianz.lms.model.LeaveCategories"));

	public LeaveCategoriesModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _LeaveTypeCode;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setLeaveTypeCode(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _LeaveTypeCode;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveCategories.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveCategories.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("LeaveCategoryCode", getLeaveCategoryCode());
		attributes.put("LeaveCategory", getLeaveCategory());
		attributes.put("LeaveTypeCode", getLeaveTypeCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String LeaveCategoryCode = (String)attributes.get("LeaveCategoryCode");

		if (LeaveCategoryCode != null) {
			setLeaveCategoryCode(LeaveCategoryCode);
		}

		String LeaveCategory = (String)attributes.get("LeaveCategory");

		if (LeaveCategory != null) {
			setLeaveCategory(LeaveCategory);
		}

		Integer LeaveTypeCode = (Integer)attributes.get("LeaveTypeCode");

		if (LeaveTypeCode != null) {
			setLeaveTypeCode(LeaveTypeCode);
		}
	}

	@JSON
	@Override
	public String getLeaveCategoryCode() {
		if (_LeaveCategoryCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _LeaveCategoryCode;
		}
	}

	@Override
	public void setLeaveCategoryCode(String LeaveCategoryCode) {
		_columnBitmask = -1L;

		if (_originalLeaveCategoryCode == null) {
			_originalLeaveCategoryCode = _LeaveCategoryCode;
		}

		_LeaveCategoryCode = LeaveCategoryCode;
	}

	public String getOriginalLeaveCategoryCode() {
		return GetterUtil.getString(_originalLeaveCategoryCode);
	}

	@JSON
	@Override
	public String getLeaveCategory() {
		if (_LeaveCategory == null) {
			return StringPool.BLANK;
		}
		else {
			return _LeaveCategory;
		}
	}

	@Override
	public void setLeaveCategory(String LeaveCategory) {
		_columnBitmask |= LEAVECATEGORY_COLUMN_BITMASK;

		if (_originalLeaveCategory == null) {
			_originalLeaveCategory = _LeaveCategory;
		}

		_LeaveCategory = LeaveCategory;
	}

	public String getOriginalLeaveCategory() {
		return GetterUtil.getString(_originalLeaveCategory);
	}

	@JSON
	@Override
	public int getLeaveTypeCode() {
		return _LeaveTypeCode;
	}

	@Override
	public void setLeaveTypeCode(int LeaveTypeCode) {
		_columnBitmask |= LEAVETYPECODE_COLUMN_BITMASK;

		if (!_setOriginalLeaveTypeCode) {
			_setOriginalLeaveTypeCode = true;

			_originalLeaveTypeCode = _LeaveTypeCode;
		}

		_LeaveTypeCode = LeaveTypeCode;
	}

	public int getOriginalLeaveTypeCode() {
		return _originalLeaveTypeCode;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LeaveCategories toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveCategories)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveCategoriesImpl leaveCategoriesImpl = new LeaveCategoriesImpl();

		leaveCategoriesImpl.setLeaveCategoryCode(getLeaveCategoryCode());
		leaveCategoriesImpl.setLeaveCategory(getLeaveCategory());
		leaveCategoriesImpl.setLeaveTypeCode(getLeaveTypeCode());

		leaveCategoriesImpl.resetOriginalValues();

		return leaveCategoriesImpl;
	}

	@Override
	public int compareTo(LeaveCategories leaveCategories) {
		int value = 0;

		value = getLeaveCategoryCode()
					.compareTo(leaveCategories.getLeaveCategoryCode());

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

		if (!(obj instanceof LeaveCategories)) {
			return false;
		}

		LeaveCategories leaveCategories = (LeaveCategories)obj;

		int primaryKey = leaveCategories.getPrimaryKey();

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
		LeaveCategoriesModelImpl leaveCategoriesModelImpl = this;

		leaveCategoriesModelImpl._originalLeaveCategoryCode = leaveCategoriesModelImpl._LeaveCategoryCode;

		leaveCategoriesModelImpl._originalLeaveCategory = leaveCategoriesModelImpl._LeaveCategory;

		leaveCategoriesModelImpl._originalLeaveTypeCode = leaveCategoriesModelImpl._LeaveTypeCode;

		leaveCategoriesModelImpl._setOriginalLeaveTypeCode = false;

		leaveCategoriesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveCategories> toCacheModel() {
		LeaveCategoriesCacheModel leaveCategoriesCacheModel = new LeaveCategoriesCacheModel();

		leaveCategoriesCacheModel.LeaveCategoryCode = getLeaveCategoryCode();

		String LeaveCategoryCode = leaveCategoriesCacheModel.LeaveCategoryCode;

		if ((LeaveCategoryCode != null) && (LeaveCategoryCode.length() == 0)) {
			leaveCategoriesCacheModel.LeaveCategoryCode = null;
		}

		leaveCategoriesCacheModel.LeaveCategory = getLeaveCategory();

		String LeaveCategory = leaveCategoriesCacheModel.LeaveCategory;

		if ((LeaveCategory != null) && (LeaveCategory.length() == 0)) {
			leaveCategoriesCacheModel.LeaveCategory = null;
		}

		leaveCategoriesCacheModel.LeaveTypeCode = getLeaveTypeCode();

		return leaveCategoriesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{LeaveCategoryCode=");
		sb.append(getLeaveCategoryCode());
		sb.append(", LeaveCategory=");
		sb.append(getLeaveCategory());
		sb.append(", LeaveTypeCode=");
		sb.append(getLeaveTypeCode());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.trianz.lms.model.LeaveCategories");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>LeaveCategoryCode</column-name><column-value><![CDATA[");
		sb.append(getLeaveCategoryCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LeaveCategory</column-name><column-value><![CDATA[");
		sb.append(getLeaveCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>LeaveTypeCode</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeCode());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveCategories.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveCategories.class
		};
	private String _LeaveCategoryCode;
	private String _originalLeaveCategoryCode;
	private String _LeaveCategory;
	private String _originalLeaveCategory;
	private int _LeaveTypeCode;
	private int _originalLeaveTypeCode;
	private boolean _setOriginalLeaveTypeCode;
	private long _columnBitmask;
	private LeaveCategories _escapedModel;
}