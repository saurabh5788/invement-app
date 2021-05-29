package com.customer.investment.investmentapp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Double getStockPrice(String stockSymbol) throws Exception{
		if(stockPriceMap.containsKey(stockSymbol))
			return stockPriceMap.get(stockSymbol);
		else
			return null;
	}
}
