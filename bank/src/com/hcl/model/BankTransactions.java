package com.hcl.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class BankTransactions implements Serializable{

	@Id
	@Column(name="CARD_NUMBER")
	private long cardnumber;
	
	@Column(name="TRANSACTION_DATE")
	private String transactiondate;
	
	@Column(name="AMOUNT")
	private float amount;
	
	@OneToMany
	@JoinColumn(name="Card_Number")
	private List<BankAccount> bankDetails;

	public BankTransactions() {
		super();
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public List<BankAccount> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankAccount> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public BankTransactions(long cardnumber, String transactiondate, float amount, List<BankAccount> bankDetails) {
		super();
		this.cardnumber = cardnumber;
		this.transactiondate = transactiondate;
		this.amount = amount;
		this.bankDetails = bankDetails;
	}

	
}
