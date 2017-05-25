package com.opengi.ecommerce.logreport.bean;

import java.util.List;

import com.opengi.ecommerce.logreport.domain.Domain;

public class Application {
	
	private String applicationName;
	private String lastReportDate;
	private List<Domain> domainList;

	public List<Domain> getDomainList() {
		return domainList;
	}

	public void setDomainList(List <Domain> domainList) {
		this.domainList = domainList;
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
