package com.opengi.ecommerce.logreport.service.impl;

import java.util.List;

import com.opengi.ecommerce.logreport.bean.Application;
import com.opengi.ecommerce.logreport.dao.ApplicationDao;
import com.opengi.ecommerce.logreport.service.ApplicationService;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationDao applicationDao;
	
	public ApplicationDao getApplicationDao() {
		return applicationDao;
	}

	public void setApplicationDao(ApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}

	@Override
	public List<Application> getApplicationList() {
		return applicationDao.getAllApplications();
	}

}
