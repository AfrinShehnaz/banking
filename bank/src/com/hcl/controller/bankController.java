package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.BankAccount;
import com.hcl.service.BankService;

@Controller
public class bankController {

	private BankService bankService;
	@Autowired
	public void setUserService(BankService bankService) {
		this.bankService=bankService;
	}
	@RequestMapping("/index")
	public ModelAndView loginpage() {
		
	ModelAndView model=new ModelAndView();
	model.setViewName("loginPage");
		return model;	
	}
	@RequestMapping(value="/login",method= {RequestMethod.POST,RequestMethod.GET})
	public String loginUser(@Valid @ModelAttribute("bankAccount")BankAccount bankAccount,BindingResult result) {
		System.out.println("The user name is:"+bankAccount.getName());
		boolean checkBank=bankService.bank(bankAccount.getName());
		if(checkBank==true) {
			System.out.println("login credentials are correct");
			String name=bankAccount.getName();
			return "redirect:/bankList";
		}else {
			System.out.println("login credentials are incorrect ");
			return "redirect:/loginPage";
		
			
		}	}
	}

