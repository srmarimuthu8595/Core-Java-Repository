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
public class MEMDetailsDAO extends BaseDAO<MEMDetails, Integer>{
	

	@Autowired
	public MEMDetailsDAO(SessionFactory sessionFactory) {
		super(MEMDetails.class);
		super.setSessionFactory(sessionFactory);
		
	}
	
	@Autowired
	private MEMContributionDAO mEMContributionDAO;
	
	
	public MEMDetails getMEMDetails() {
		MEMDetails mEMDetails;
		Session sess = getSessionFactory().openSession();
		String sql = "FROM MEMDetails";
		Query q = sess.createQuery(sql);
		List<MEMDetails> mEMDetailsDetails = (List<MEMDetails>) q.list();
		if(sess.isOpen()){
			sess.close();
		}	
		mEMDetails= mEMDetailsDetails.get(0);
		List<MEMContribution> mEMContributionList= mEMContributionDAO.getMEMContribution();
		mEMDetails.setmEMContributionList(mEMContributionList);
		return mEMDetails;
	}
	
}
