/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.sample.model.Insulted;
import com.liferay.sample.model.InsultedModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Insulted service. Represents a row in the &quot;SAMPLE_Insulted&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.sample.model.InsultedModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InsultedImpl}.
 * </p>
 *
 * @author nickgaskill
 * @see InsultedImpl
 * @see com.liferay.sample.model.Insulted
 * @see com.liferay.sample.model.InsultedModel
 * @generated
 */
public class InsultedModelImpl extends BaseModelImpl<Insulted>
	implements InsultedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a insulted model instance should use the {@link com.liferay.sample.model.Insulted} interface instead.
	 */
	public static final String TABLE_NAME = "SAMPLE_Insulted";
	public static final Object[][] TABLE_COLUMNS = {
			{ "insultedId", Types.BIGINT },
			{ "insult", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table SAMPLE_Insulted (insultedId LONG not null primary key,insult VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table SAMPLE_Insulted";
	public static final String ORDER_BY_JPQL = " ORDER BY insulted.insultedId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SAMPLE_Insulted.insultedId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.sample.model.Insulted"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.sample.model.Insulted"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.sample.model.Insulted"));

	public InsultedModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _insultedId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInsultedId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _insultedId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Insulted.class;
	}

	@Override
	public String getModelClassName() {
		return Insulted.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("insultedId", getInsultedId());
		attributes.put("insult", getInsult());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long insultedId = (Long)attributes.get("insultedId");

		if (insultedId != null) {
			setInsultedId(insultedId);
		}

		String insult = (String)attributes.get("insult");

		if (insult != null) {
			setInsult(insult);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getInsultedId() {
		return _insultedId;
	}

	@Override
	public void setInsultedId(long insultedId) {
		_insultedId = insultedId;
	}

	@Override
	public String getInsult() {
		if (_insult == null) {
			return StringPool.BLANK;
		}
		else {
			return _insult;
		}
	}

	@Override
	public void setInsult(String insult) {
		_insult = insult;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Insulted.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Insulted toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Insulted)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InsultedImpl insultedImpl = new InsultedImpl();

		insultedImpl.setInsultedId(getInsultedId());
		insultedImpl.setInsult(getInsult());
		insultedImpl.setGroupId(getGroupId());
		insultedImpl.setCompanyId(getCompanyId());
		insultedImpl.setUserId(getUserId());

		insultedImpl.resetOriginalValues();

		return insultedImpl;
	}

	@Override
	public int compareTo(Insulted insulted) {
		long primaryKey = insulted.getPrimaryKey();

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

		if (!(obj instanceof Insulted)) {
			return false;
		}

		Insulted insulted = (Insulted)obj;

		long primaryKey = insulted.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Insulted> toCacheModel() {
		InsultedCacheModel insultedCacheModel = new InsultedCacheModel();

		insultedCacheModel.insultedId = getInsultedId();

		insultedCacheModel.insult = getInsult();

		String insult = insultedCacheModel.insult;

		if ((insult != null) && (insult.length() == 0)) {
			insultedCacheModel.insult = null;
		}

		insultedCacheModel.groupId = getGroupId();

		insultedCacheModel.companyId = getCompanyId();

		insultedCacheModel.userId = getUserId();

		return insultedCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{insultedId=");
		sb.append(getInsultedId());
		sb.append(", insult=");
		sb.append(getInsult());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.Insulted");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>insultedId</column-name><column-value><![CDATA[");
		sb.append(getInsultedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insult</column-name><column-value><![CDATA[");
		sb.append(getInsult());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Insulted.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Insulted.class
		};
	private long _insultedId;
	private String _insult;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Insulted _escapedModel;
}