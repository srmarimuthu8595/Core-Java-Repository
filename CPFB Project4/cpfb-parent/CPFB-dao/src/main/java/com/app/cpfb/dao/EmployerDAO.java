package com.app.cpfb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.cpfb.model.Employer;
@Repository
public class EmployerDAO extends BaseDAO<Employer, Integer>{
	
	@Autowired
	public EmployerDAO(SessionFactory sessionFactory) {
		super(Employer.class);
		super.setSessionFactory(sessionFactory);
		
	}
	
	public List<Employer> getEmployerDetails() {
		Session sess = getSessionFactory().openSession();
		String sql = "FROM Employer";
		Query q = sess.createQuery(sql);
		List<Employer> employerDetails = (List<Employer>) q.list();
		if(sess.isOpen()){
			sess.close();
		}	
		return employerDetails;
	}
	


}
