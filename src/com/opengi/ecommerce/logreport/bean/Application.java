package com.opengi.ecommerce.logreport.bean;

import java.util.Map;

import com.opengi.ecommerce.logreport.domain.Domain;

public class Application {
	
	private String applicationName;
	private String lastReportDate;
	private Map<String, Domain> domainMap;

	public Map<String, Domain> getDomainMap() {
		return domainMap;
	}

	public void setModules(Map<String, Domain> domainMap) {
		this.domainMap = domainMap;
	}

	public String getLastReportDate() {
		return lastReportDate;
	}

	public void setLastReportDate(String lastReportDate) {
		this.lastReportDate = lastReportDate;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
}
