package com.hcl.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANKACCOUNT")
public class BankAccount implements Serializable {
	@Id
	@Column(name="CARD_NUMBER")
	private long cardnumber;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="BANK")
	private String bank;
    
	@Column(name="CARD_LIMIT")
	private int cardlimit;
	
	@ManyToOne
	@JoinColumn(name="Card_Number")
	private  BankTransactions bankTransaction;

	public BankAccount(long cardnumber, String name, int age, String gender, String bank, int cardlimit,
			BankTransactions bankTransaction) {
		super();
		this.cardnumber = cardnumber;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cardlimit = cardlimit;
		this.bankTransaction = bankTransaction;
	}

	public BankAccount() {
		super();
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getCardlimit() {
		return cardlimit;
	}

	public void setCardlimit(int cardlimit) {
		this.cardlimit = cardlimit;
	}

	public BankTransactions getBankTransaction() {
		return bankTransaction;
	}

	public void setBankTransaction(BankTransactions bankTransaction) {
		this.bankTransaction = bankTransaction;
	}

	
}
