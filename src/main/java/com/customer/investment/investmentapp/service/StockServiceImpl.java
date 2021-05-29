package com.customer.investment.investmentapp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.investment.investmentapp.common.CustomApplicationProperties;
import com.customer.investment.investmentapp.exception.StockServiceException;

/**
 * Implementation of Stock Service.
 * 
 * @author Saurabh Singh
 *
 */
@Service
public class StockServiceImpl implements StockService {

	private Map<String, Double> stockPriceMap;
	private Map<String, String> stockProperties;

	@Autowired
	public StockServiceImpl(Map<String, Double> stockPriceMap,
			CustomApplicationProperties customApplicationProperties) {
		this.stockPriceMap = stockPriceMap;
		this.stockProperties = customApplicationProperties.getStock();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.customer.investment.investmentapp.service.StockService#getStockPrice
	 * (java.lang.String)
	 */
	@Override
	public Double fetchCurrentStockPrice(String stockSymbol) {
		if (!stockPriceMap.containsKey(stockSymbol))
			throw new StockServiceException(stockProperties.get("nostock"));
		return stockPriceMap.get(stockSymbol);
	}

}
