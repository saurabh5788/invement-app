package com.customer.investment.investmentapp.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class OrderStockRequestDTO implements Serializable {



	private static final long serialVersionUID = 1L;
	@Positive
	private int accountId;
	@NotBlank
	private String stockSymbol;
	@Positive
	private int numberOfStock;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
}
