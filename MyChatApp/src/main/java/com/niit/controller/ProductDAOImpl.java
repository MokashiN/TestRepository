package com.niit.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false) 
	@Override
	public void addRegister(Register r)
	{
		//sessionFactory.getCurrentSession().saveOrUpdate(r);
		Session session=sessionFactory.openSession();
		session.save(r);
		session.flush();
		System.out.println("from ProductDaoImpl");
		//session.close();
	}

}
