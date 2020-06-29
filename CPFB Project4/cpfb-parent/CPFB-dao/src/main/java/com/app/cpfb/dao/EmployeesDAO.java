package com.app.cpfb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.cpfb.dao.BaseDAO;
import com.app.cpfb.model.Employees;

@Repository
public class EmployeesDAO extends BaseDAO<Employees, Integer>{
	
	@Autowired
	public EmployeesDAO(SessionFactory sessionFactory) {
		super(Employees.class);
		super.setSessionFactory(sessionFactory);
		
	}
	
	public List<Employees> getEmployees() {
		Session sess = getSessionFactory().openSession();
		String sql = "FROM Employees";
		Query q = sess.createQuery(sql);
		List<Employees> employeesDetails = (List<Employees>) q.list();
		if(sess.isOpen()){
			sess.close();
		}	
		return employeesDetails;
	}
	

}
