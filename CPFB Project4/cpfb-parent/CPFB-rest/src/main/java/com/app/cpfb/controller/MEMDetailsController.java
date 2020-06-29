package com.app.cpfb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.app.cpfb.dao.MEMDetailsDAO;
import com.app.cpfb.model.MEMDetails;

@Controller
@RequestMapping(value = "/rest/memdetails")
public class MEMDetailsController {
	
	@Autowired
	MEMDetailsDAO mEMDetailsDAO;
	
	@RequestMapping(value = "/getMEMDetails", method = RequestMethod.GET)
	public @ResponseBody MEMDetails getEmployeeDetails() {
		MEMDetails mEMDetails = mEMDetailsDAO.getMEMDetails();
		return mEMDetails;
	}


}
