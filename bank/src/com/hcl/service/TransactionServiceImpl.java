package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.TransactionDao;
import com.hcl.model.BankAccount;

public class TransactionServiceImpl implements TransactionService{
TransactionDao transactionDao;
@Autowired(required=true)
public void setTransactionDao(TransactionDao transactionDao) {
	this.transactionDao=transactionDao;
}
	@Override
	@Transactional
	public List<BankAccount> bankList() {
		// TODO Auto-generated method stub
		return transactionDao.bankList();
	}

}
