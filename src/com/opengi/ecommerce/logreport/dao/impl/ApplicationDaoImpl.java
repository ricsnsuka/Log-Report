package com.opengi.ecommerce.logreport.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import com.opengi.ecommerce.logreport.bean.Application;
import com.opengi.ecommerce.logreport.dao.ApplicationDao;
import com.opengi.ecommerce.logreport.parser.XMLParser;

public class ApplicationDaoImpl implements ApplicationDao {

	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Application> getAllApplications() {
		XMLParser parser = new XMLParser("src\\resources\\applications.xml");
		return parser.getApplicationValues();
	}

}
