package com.online.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.dao.CustomerAccountDAO;
import com.online.model.Account;

@Repository("accountDAO")
public class CustomerAccountDAOImpl implements CustomerAccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Account createCustomer(Account account) {
		Session session = this.sessionFactory.openSession();
		Transaction trns=session.beginTransaction();
		
		session.save(account);
		trns.commit();
		//session.flush();
		return account;
	}

}
