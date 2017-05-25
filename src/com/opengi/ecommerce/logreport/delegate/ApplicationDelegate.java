package com.opengi.ecommerce.logreport.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opengi.ecommerce.logreport.bean.Application;
import com.opengi.ecommerce.logreport.service.ApplicationService;

public class ApplicationDelegate {
	
	@Autowired
	ApplicationService applicationService;

	public ApplicationService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}
	
	public List<Application> getApplicationList() {
		return applicationService.getApplicationList();
	}
	
	
}
