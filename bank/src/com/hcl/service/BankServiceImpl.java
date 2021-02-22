package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.BankDao;

@Service
public class BankServiceImpl implements BankService{

	private BankDao bankDao;
	@Autowired
	public void setUserDao(BankDao banksDao) {
		this.bankDao=banksDao;
	}
	public boolean bank(String name) {
		// TODO Auto-generated method stub
		System.out.println("check!...");
		return bankDao.bank(name);
}
}
