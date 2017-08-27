package com.online.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.BranchDAO;
import com.online.model.Branch;


@Repository("branchDao")

public class BranchDaoImpl implements BranchDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Branch createBranch(Branch  branch) {

		Session session = this.sessionFactory.openSession();
	//Transaction trns=	session.beginTransaction();
		session.save(branch);
		//trns.commit();
		return branch;
	}


	
	
	
} 
