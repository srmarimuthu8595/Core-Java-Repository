package com.app.cpfb.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.cpfb.dao.MyEmploeeDAO;
import com.app.cpfb.model.Employer;
import com.app.cpfb.model.MyEmployee;



@Controller
@RequestMapping(value = "/rest/employeedetails")
public class MyEmployeeController {
	
	@Autowired
	MyEmploeeDAO myEmployeeDAO;
	
	@RequestMapping(value ="/saveEmployee", method = RequestMethod.POST)
	public @ResponseBody String saveEmployee(@RequestBody MyEmployee myEmployee){
		return myEmployeeDAO.saveEmployee(myEmployee);
	}
	
	@RequestMapping(value = "/getEmployerDetails", method = RequestMethod.GET)
	public @ResponseBody List<MyEmployee> getEmployeeDetails() {
		List<MyEmployee> employerList = myEmployeeDAO.getEmployeeDetails();
		return employerList;
	}
	
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public @ResponseBody MyEmployee getEmployee(long empId) {
		MyEmployee myEmployee = myEmployeeDAO.getEmployee(empId);
		return myEmployee;
	}
	
	@RequestMapping(value ="/updateEmployee", method = RequestMethod.POST)
	public @ResponseBody String updateEmployee(@RequestBody MyEmployee myEmployee){
		return myEmployeeDAO.updateEmployee(myEmployee);
	}
	
	@RequestMapping(value ="/deleteEmployee", method = RequestMethod.POST)
	public @ResponseBody String deleteEmployee(@RequestBody MyEmployee myEmployee){
		return myEmployeeDAO.deleteEmployee(myEmployee);
	}
	
	

	
}


