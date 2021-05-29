package com.customer.investment.investmentapp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.investment.investmentapp.exception.StockServiceException;

/**
 * Implementation of Stock Service.
 * @author Saurabh Singh
 *
 */
@Service
public class StockServiceImpl implements StockService {	
	
	private Map<String,Double> stockPriceMap;
	
	@Autowired
	public StockServiceImpl(Map<String,Double> stockPriceMap){
		this.stockPriceMap = stockPriceMap; 
	}
	
	/* (non-Javadoc)
	 * @see com.customer.investment.investmentapp.service.StockService#getStockPrice(java.lang.String)
	 */
	@Override
	public Double getStockPrice(String stockSymbol) {
		if(!stockPriceMap.containsKey(stockSymbol))
			throw new StockServiceException("Stock symbol is not Present.");
		return stockPriceMap.get(stockSymbol);
	}
}
