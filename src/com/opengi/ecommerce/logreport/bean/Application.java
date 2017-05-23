package com.opengi.ecommerce.logreport.bean;

import java.util.List;

public class Application {
	
	private String applicationName;
	private String lastReportDate;
	private List<String> modules;

	public List<String> getModules() {
		return modules;
	}

	public void setModules(List<String> modules) {
		this.modules = modules;
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
