package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.model.BankAccount;
@Repository
public class TransactionDaoImpl  implements TransactionDao{

	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this .sessionFactory= sessionFactory;
	}


	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<BankAccount> bankList() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from BankAccount ta where ta.card_number=:tacard_number").setParameter("ta.transaction_date", 2)
				.setParameter("ta.amount", 2).list();
		
	}

}
