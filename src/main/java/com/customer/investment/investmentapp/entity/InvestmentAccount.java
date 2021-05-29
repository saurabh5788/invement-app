package com.customer.investment.investmentapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class InvestmentAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "investment_account_id")
	private int investmentAccountId;
	
	@ManyToOne
	private UserDetails userDetails;
	
	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "amount")
	private double amount;


	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
