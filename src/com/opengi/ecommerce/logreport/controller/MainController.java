package com.opengi.ecommerce.logreport.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opengi.ecommerce.logreport.bean.Application;

@Controller
public class MainController {
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String displayMainPage(ModelMap model) {
		//model.addAttribute("message", "log report");
		return "main";
	}
	
	private List<Application> collectAllApplications() {
		return null;
	}
}
