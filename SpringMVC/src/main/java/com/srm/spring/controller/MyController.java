package com.srm.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/getAllCountries", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCountries() {
	
	System.out.println("getAllCountries");
	
	System.out.println("getAllCountries");
	
	System.out.println("getAllCountries");
	
	  return "myContries";
	}

}
