package com.app.cpfb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.app.cpfb.dao.EmployerDAO;
import com.app.cpfb.model.Employer;

@Controller
@RequestMapping(value = "/rest/employer")
public class EmployerController {
	
	@Autowired
	EmployerDAO employerDAO;
	
	@RequestMapping(value = "/getEmployerDetails", method = RequestMethod.GET)
	public @ResponseBody List<Employer> getEmployeeDetails() {
		List<Employer> employerList = employerDAO.getEmployerDetails();
		return employerList;
	}


}
