package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.model.BankAccount;
@Repository
public class BankDaoImpl implements BankDao{
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this .sessionFactory= sessionFactory;
	}

	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public boolean bank(String name) {
		System.out.println("checking!!..");
		
		List <BankAccount> list=sessionFactory.getCurrentSession().createQuery("from bankAccount ba where ba.name=baname")
				.setParameter("baname", name).list();
		
		if(list.size()==0) {
			return false;
		}else {
		
		// TODO Auto-generated method stub
		return true;
	}
	}
}

