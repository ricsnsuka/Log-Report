package com.opengi.ecommerce.logreport.domain;

import java.util.List;

import com.opengi.ecommerce.logreport.bean.LogObject;

public class Domain {
	private String name;
	private List<LogObject> log;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<LogObject> getLog() {
		return log;
	}
	public void setLog(List<LogObject> log) {
		this.log = log;
	}
	
}
