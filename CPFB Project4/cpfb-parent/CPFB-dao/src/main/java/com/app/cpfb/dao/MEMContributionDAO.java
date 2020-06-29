package com.app.cpfb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.cpfb.model.MEMContribution;
import com.app.cpfb.model.MEMDetails;

@Repository
public class MEMContributionDAO extends BaseDAO<MEMContribution, Integer>{

	@Autowired
	public MEMContributionDAO(SessionFactory sessionFactory) {
		super(MEMContribution.class);
		super.setSessionFactory(sessionFactory);
	}
	
	public List<MEMContribution> getMEMContribution() {
		Session sess = getSessionFactory().openSession();
		String sql = "FROM MEMContribution";
		Query q = sess.createQuery(sql);
		List<MEMContribution> mEMContributionList = (List<MEMContribution>) q.list();
		if(sess.isOpen()){
			sess.close();
		}	
		return mEMContributionList;
	}
	
}
