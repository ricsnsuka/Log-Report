package com.opengi.ecommerce.logreport.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opengi.ecommerce.logreport.bean.Application;
import com.opengi.ecommerce.logreport.delegate.ApplicationDelegate;

@Controller
public class MainController {
	
	ApplicationDelegate applicationDelegate;
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String displayMainPage(ModelMap model) {
		model.addAttribute("applications", collectAllApplications());
		return "main";
	}
	
	private List<Application> collectAllApplications() {
		return applicationDelegate.getApplicationList();
	}
}
