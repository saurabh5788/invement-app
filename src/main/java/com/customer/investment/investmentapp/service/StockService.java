package com.customer.investment.investmentapp.service;

/**
 * Service Interface for Stock related functions.
 * 
 * @author Saurabh Singh
 */
public interface StockService {

	/**
	 * To fetch the current Stock Price of passed Stock Symbol.
	 * @param stockSymbol
	 * @return
	 * @throws Exception
	 */
	Double getStockPrice(String stockSymbol) throws Exception;

}
