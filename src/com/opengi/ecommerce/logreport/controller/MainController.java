package com.opengi.ecommerce.logreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayMainPage(ModelMap model) {
		model.addAttribute("message", "log report");
		return "main";
	}
}
