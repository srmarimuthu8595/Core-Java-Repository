package com.srm.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srm.spring.model.CustomerCredientials;

@Repository
public class LoginDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String doLogin(CustomerCredientials object) throws Exception{
		CustomerCredientials retobject=null;
		String status="";
		try{
			Session session = sessionFactory.getCurrentSession();
			Query<CustomerCredientials> query= session.createQuery("From CustomerCredientials where username='"+object.getUsername()+"' and password='"+object.getPassword()+"'");
			List<CustomerCredientials> userlist = query.getResultList();
			if(userlist!=null&&userlist.size()>0){
				retobject =userlist.get(0);
				if(retobject.getUsername().equals(object.getUsername())&&retobject.getPassword().equals(object.getPassword())){
					status="Login success";
				}else{
					status="Login not success due to invalid username and password";
				}
			}
		}catch(Exception ex){
			throw ex;
		}
		return 	status;		
	}
	
	

}
