package com.online.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.UserDAO;
import com.online.model.User;

@Repository("userDao")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	
	public User createUser(User user) {

		Session session = this.sessionFactory.openSession();
		Transaction trns=session.beginTransaction();
		session.save(user);
		trns.commit();
		//session.flush();
		return user;
	}

}
