package com.srm.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srm.spring.model.CustomerCredientials;

@Repository
public class CustomerCredientialsDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public CustomerCredientials saveCustomerCredientials(CustomerCredientials custcreditdtls) throws Exception{
		try{
			Session session = sessionFactory.getCurrentSession();
			session.save(custcreditdtls);
		}catch(Exception ex){
			throw ex;
		}
		return custcreditdtls;
	}
	
	
	public CustomerCredientials updateCustomerCredientials(CustomerCredientials custcreditdtls) throws Exception{
		try{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(custcreditdtls);
		}catch(Exception ex){
			throw ex;
		}
		return custcreditdtls;
	}
	
	

	
	
	
	
	
	
	

}
