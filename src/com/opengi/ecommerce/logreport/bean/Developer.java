package com.opengi.ecommerce.logreport.bean;

public class Developer {
	private String name;
	private String emailAddress;
	private boolean toReceiveReport;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public boolean isToReceiveReport() {
		return toReceiveReport;
	}
	public void setToReceiveReport(boolean toReceiveReport) {
		this.toReceiveReport = toReceiveReport;
	}
	
}
