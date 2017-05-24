package com.opengi.ecommerce.logreport.bean;

import com.opengi.ecommerce.logreport.type.SevereLevel;

public class LogObject {
	private SevereLevel level;
	private String logInformation;
	private int occurrences;
	
	
	public SevereLevel getLevel() {
		return level;
	}
	public void setLevel(SevereLevel level) {
		this.level = level;
	}
	public String getLogInformation() {
		return logInformation;
	}
	public void setLogInformation(String logInformation) {
		this.logInformation = logInformation;
	}
	public int getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(int occurrences) {
		this.occurrences = occurrences;
	}
	
	
	
}
