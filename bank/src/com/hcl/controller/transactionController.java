package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.BankTransactions;
import com.hcl.service.TransactionService;

@Controller
public class transactionController {
private TransactionService transactionService;
@Autowired
public void setTransactionService(TransactionService transactionService) {
	this.transactionService =transactionService;
}
@RequestMapping("/bankList")
public ModelAndView bankList() {
	
	ModelAndView model=new ModelAndView();
	model.addObject("banks",new BankTransactions());
	model.addObject("bankList",transactionService.bankList());
	System.out.println("details are added");
	model.setViewName("bankList");
	return model;
	
}
}
