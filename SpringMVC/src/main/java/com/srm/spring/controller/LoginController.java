package com.srm.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.srm.spring.dto.CustomerCredientialsDTO;
import com.srm.spring.service.LoginService;

@RestController
@RequestMapping("/rest/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/doLogin", method = RequestMethod.POST)
	public @ResponseBody String doLogin(@RequestBody CustomerCredientialsDTO dtoObject){
		String status="";
		try{
			status=loginService.doLogin(dtoObject);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	  return status;
	}

}
