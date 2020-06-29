package com.app.cpfb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.cpfb.model.Employer;
import com.app.cpfb.model.MyEmployee;

@Repository
public class MyEmploeeDAO extends BaseDAO<MyEmployee,Integer>{

	@Autowired
	public MyEmploeeDAO(SessionFactory sessionFactory) {
		super(MyEmployee.class);
	    super.setSessionFactory(sessionFactory);
	}
	   
	   public String saveEmployee(MyEmployee myEmployee){
			String savedStatus="Saved Successfully";
			Session sess = getSessionFactory().openSession();
			sess.save(myEmployee);
			if(sess.isOpen()){
			   sess.close();
			}	
			return savedStatus;
		
	   }
	   
	   public List<MyEmployee> getEmployeeDetails() {
			Session sess = getSessionFactory().openSession();
			String sql = "FROM MyEmployee";
			Query q = sess.createQuery(sql);
			List<MyEmployee> employerDetails = (List<MyEmployee>) q.list();
			if(sess.isOpen()){
				sess.close();
			}	
			return employerDetails;
	   }
	   
	   public MyEmployee getEmployee(long empId){
			Session sess = getSessionFactory().openSession();
			MyEmployee myEmployee =(MyEmployee)sess.get(MyEmployee.class, empId);
			if(sess.isOpen()){
			   sess.close();
			}
			return myEmployee;
		
	   }
	   
	   public String updateEmployee(MyEmployee myEmployee){
		   String updatedStatus="Updated Successfully";
			Session sess = getSessionFactory().openSession();
			 sess.getTransaction().begin();
			sess.saveOrUpdate(myEmployee);
			if(sess.isOpen()){
			   sess.getTransaction().commit();	
			   sess.close();
			}	
			return updatedStatus;
		
	   }
	   
	   public String deleteEmployee(MyEmployee myEmployee){
			String updatedStatus="Deleted Successfully";
			Session sess = getSessionFactory().openSession();
			sess.delete(myEmployee);
			if(sess.isOpen()){
			   sess.close();
			}	
			return updatedStatus;
	  }
		
		
	

 
}
