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

package com.liferay.sample.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.sample.model.InsultLog;

import java.util.List;

/**
 * The persistence utility for the insult log service. This utility wraps {@link InsultLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nickgaskill
 * @see InsultLogPersistence
 * @see InsultLogPersistenceImpl
 * @generated
 */
public class InsultLogUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(InsultLog insultLog) {
		getPersistence().clearCache(insultLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<InsultLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InsultLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InsultLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InsultLog update(InsultLog insultLog)
		throws SystemException {
		return getPersistence().update(insultLog);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InsultLog update(InsultLog insultLog,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(insultLog, serviceContext);
	}

	/**
	* Caches the insult log in the entity cache if it is enabled.
	*
	* @param insultLog the insult log
	*/
	public static void cacheResult(com.liferay.sample.model.InsultLog insultLog) {
		getPersistence().cacheResult(insultLog);
	}

	/**
	* Caches the insult logs in the entity cache if it is enabled.
	*
	* @param insultLogs the insult logs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.sample.model.InsultLog> insultLogs) {
		getPersistence().cacheResult(insultLogs);
	}

	/**
	* Creates a new insult log with the primary key. Does not add the insult log to the database.
	*
	* @param insultLogId the primary key for the new insult log
	* @return the new insult log
	*/
	public static com.liferay.sample.model.InsultLog create(long insultLogId) {
		return getPersistence().create(insultLogId);
	}

	/**
	* Removes the insult log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param insultLogId the primary key of the insult log
	* @return the insult log that was removed
	* @throws com.liferay.sample.NoSuchInsultLogException if a insult log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.InsultLog remove(long insultLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchInsultLogException {
		return getPersistence().remove(insultLogId);
	}

	public static com.liferay.sample.model.InsultLog updateImpl(
		com.liferay.sample.model.InsultLog insultLog)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(insultLog);
	}

	/**
	* Returns the insult log with the primary key or throws a {@link com.liferay.sample.NoSuchInsultLogException} if it could not be found.
	*
	* @param insultLogId the primary key of the insult log
	* @return the insult log
	* @throws com.liferay.sample.NoSuchInsultLogException if a insult log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.InsultLog findByPrimaryKey(
		long insultLogId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchInsultLogException {
		return getPersistence().findByPrimaryKey(insultLogId);
	}

	/**
	* Returns the insult log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param insultLogId the primary key of the insult log
	* @return the insult log, or <code>null</code> if a insult log with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.InsultLog fetchByPrimaryKey(
		long insultLogId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(insultLogId);
	}

	/**
	* Returns all the insult logs.
	*
	* @return the insult logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.InsultLog> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the insult logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.InsultLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insult logs
	* @param end the upper bound of the range of insult logs (not inclusive)
	* @return the range of insult logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.InsultLog> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the insult logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.InsultLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of insult logs
	* @param end the upper bound of the range of insult logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of insult logs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.InsultLog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the insult logs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of insult logs.
	*
	* @return the number of insult logs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InsultLogPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InsultLogPersistence)PortletBeanLocatorUtil.locate(com.liferay.sample.service.ClpSerializer.getServletContextName(),
					InsultLogPersistence.class.getName());

			ReferenceRegistry.registerReference(InsultLogUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InsultLogPersistence persistence) {
	}

	private static InsultLogPersistence _persistence;
}