package com.app.cpfb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.cpfb.dao.EmployeesDAO;
import com.app.cpfb.model.Employees;

@Controller
@CrossOrigin("*")
@RequestMapping(value = "/rest/employees")
public class EmployeesController {
	
	@Autowired
	EmployeesDAO employeesDAO;
	
	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	public @ResponseBody List<Employees> getEmployeeDetails(HttpServletResponse theHttpServletResponse) throws IOException {
		List<Employees> employeesList = employeesDAO.getEmployees();
		return employeesList;
	}


}
