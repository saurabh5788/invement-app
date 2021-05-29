package com.customer.investment.investmentapp.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.investment.investmentapp.common.CustomApplicationProperties;
import com.customer.investment.investmentapp.dtos.OrderStockRequestDTO;
import com.customer.investment.investmentapp.entity.InvestmentAccount;
import com.customer.investment.investmentapp.entity.Order;
import com.customer.investment.investmentapp.exception.StockServiceException;
import com.customer.investment.investmentapp.repository.OrderRepository;

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
	private OrderRepository orderRepository;

	@Autowired
	public StockServiceImpl(Map<String, Double> stockPriceMap,
			CustomApplicationProperties customApplicationProperties, OrderRepository orderRepository) {
		this.stockPriceMap = stockPriceMap;
		this.stockProperties = customApplicationProperties.getStock();
		this.orderRepository = orderRepository;
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
	
	@Override
	public boolean placeStockOrder(OrderStockRequestDTO orderRequest){
		boolean isOrderSuccess = false;
		Order newOrder = new Order(); 
		newOrder.setQuantity(orderRequest.getNumberOfStock());
		newOrder.setStockPrice(fetchCurrentStockPrice(orderRequest.getStockSymbol()));
		newOrder.setStockSymbol(orderRequest.getStockSymbol());

		InvestmentAccount investmentAccount = null;
		newOrder.setInvestmentAccount(investmentAccount);
		orderRepository.save(newOrder);
		return isOrderSuccess;
	}

}
