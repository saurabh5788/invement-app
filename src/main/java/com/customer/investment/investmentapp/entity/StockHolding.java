package com.customer.investment.investmentapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stock_holding")
public class StockHolding implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "holding_id")
	private int holdindId;
	
	@Column(name = "stock_symbol")
	private String stockSymbol;
	
	@Column(name = "quantity")
	private int quantity;
	
	@ManyToOne
	private InvestmentAccount investmentAccount;

	public int getHoldindId() {
		return holdindId;
	}

	public void setHoldindId(int holdindId) {
		this.holdindId = holdindId;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public InvestmentAccount getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount investmentAccount) {
		this.investmentAccount = investmentAccount;
	}
}
