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

package com.trianz.lms.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for LMSCompOffLeaveDetails. This utility wraps
 * {@link com.trianz.lms.service.impl.LMSCompOffLeaveDetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author
 * @see LMSCompOffLeaveDetailsLocalService
 * @see com.trianz.lms.service.base.LMSCompOffLeaveDetailsLocalServiceBaseImpl
 * @see com.trianz.lms.service.impl.LMSCompOffLeaveDetailsLocalServiceImpl
 * @generated
 */
public class LMSCompOffLeaveDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.trianz.lms.service.impl.LMSCompOffLeaveDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the l m s comp off leave details to the database. Also notifies the appropriate model listeners.
	*
	* @param lmsCompOffLeaveDetails the l m s comp off leave details
	* @return the l m s comp off leave details that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails addLMSCompOffLeaveDetails(
		com.trianz.lms.model.LMSCompOffLeaveDetails lmsCompOffLeaveDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addLMSCompOffLeaveDetails(lmsCompOffLeaveDetails);
	}

	/**
	* Creates a new l m s comp off leave details with the primary key. Does not add the l m s comp off leave details to the database.
	*
	* @param lmsCompOffLeaveDetailsPK the primary key for the new l m s comp off leave details
	* @return the new l m s comp off leave details
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails createLMSCompOffLeaveDetails(
		com.trianz.lms.service.persistence.LMSCompOffLeaveDetailsPK lmsCompOffLeaveDetailsPK) {
		return getService()
				   .createLMSCompOffLeaveDetails(lmsCompOffLeaveDetailsPK);
	}

	/**
	* Deletes the l m s comp off leave details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lmsCompOffLeaveDetailsPK the primary key of the l m s comp off leave details
	* @return the l m s comp off leave details that was removed
	* @throws PortalException if a l m s comp off leave details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails deleteLMSCompOffLeaveDetails(
		com.trianz.lms.service.persistence.LMSCompOffLeaveDetailsPK lmsCompOffLeaveDetailsPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteLMSCompOffLeaveDetails(lmsCompOffLeaveDetailsPK);
	}

	/**
	* Deletes the l m s comp off leave details from the database. Also notifies the appropriate model listeners.
	*
	* @param lmsCompOffLeaveDetails the l m s comp off leave details
	* @return the l m s comp off leave details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails deleteLMSCompOffLeaveDetails(
		com.trianz.lms.model.LMSCompOffLeaveDetails lmsCompOffLeaveDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteLMSCompOffLeaveDetails(lmsCompOffLeaveDetails);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.trianz.lms.model.impl.LMSCompOffLeaveDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.trianz.lms.model.impl.LMSCompOffLeaveDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.trianz.lms.model.LMSCompOffLeaveDetails fetchLMSCompOffLeaveDetails(
		com.trianz.lms.service.persistence.LMSCompOffLeaveDetailsPK lmsCompOffLeaveDetailsPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchLMSCompOffLeaveDetails(lmsCompOffLeaveDetailsPK);
	}

	/**
	* Returns the l m s comp off leave details with the primary key.
	*
	* @param lmsCompOffLeaveDetailsPK the primary key of the l m s comp off leave details
	* @return the l m s comp off leave details
	* @throws PortalException if a l m s comp off leave details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails getLMSCompOffLeaveDetails(
		com.trianz.lms.service.persistence.LMSCompOffLeaveDetailsPK lmsCompOffLeaveDetailsPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSCompOffLeaveDetails(lmsCompOffLeaveDetailsPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the l m s comp off leave detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.trianz.lms.model.impl.LMSCompOffLeaveDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of l m s comp off leave detailses
	* @param end the upper bound of the range of l m s comp off leave detailses (not inclusive)
	* @return the range of l m s comp off leave detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.trianz.lms.model.LMSCompOffLeaveDetails> getLMSCompOffLeaveDetailses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSCompOffLeaveDetailses(start, end);
	}

	/**
	* Returns the number of l m s comp off leave detailses.
	*
	* @return the number of l m s comp off leave detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int getLMSCompOffLeaveDetailsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLMSCompOffLeaveDetailsesCount();
	}

	/**
	* Updates the l m s comp off leave details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lmsCompOffLeaveDetails the l m s comp off leave details
	* @return the l m s comp off leave details that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.trianz.lms.model.LMSCompOffLeaveDetails updateLMSCompOffLeaveDetails(
		com.trianz.lms.model.LMSCompOffLeaveDetails lmsCompOffLeaveDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLMSCompOffLeaveDetails(lmsCompOffLeaveDetails);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.trianz.lms.model.LMSCompOffLeaveDetails getCompOfDetailsbyEmpIdDate(
		int empID, java.util.Date compOffDate) {
		return getService().getCompOfDetailsbyEmpIdDate(empID, compOffDate);
	}

	public static java.util.List<com.trianz.lms.model.LMSCompOffLeaveDetails> getCompoffDetailsbyApprovalName(
		java.lang.String ApprovalName) {
		return getService().getCompoffDetailsbyApprovalName(ApprovalName);
	}

	public static java.util.List<com.trianz.lms.model.LMSCompOffLeaveDetails> getCompoffDetailsbyApproverEmpId(
		int AppEmpId) {
		return getService().getCompoffDetailsbyApproverEmpId(AppEmpId);
	}

	public static com.trianz.lms.model.LMSCompOffLeaveDetails getCompOffDetailsbyCompOffId(
		int compOffId) {
		return getService().getCompOffDetailsbyCompOffId(compOffId);
	}

	public static void clearService() {
		_service = null;
	}

	public static LMSCompOffLeaveDetailsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LMSCompOffLeaveDetailsLocalService.class.getName());

			if (invokableLocalService instanceof LMSCompOffLeaveDetailsLocalService) {
				_service = (LMSCompOffLeaveDetailsLocalService)invokableLocalService;
			}
			else {
				_service = new LMSCompOffLeaveDetailsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(LMSCompOffLeaveDetailsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LMSCompOffLeaveDetailsLocalService service) {
	}

	private static LMSCompOffLeaveDetailsLocalService _service;
}