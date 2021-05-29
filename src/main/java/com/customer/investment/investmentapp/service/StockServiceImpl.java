package com.customer.investment.investmentapp.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.investment.investmentapp.common.CustomApplicationProperties;
import com.customer.investment.investmentapp.dtos.OrderStockRequestDTO;
import com.customer.investment.investmentapp.entity.InvestmentAccount;
import com.customer.investment.investmentapp.entity.Order;
import com.customer.investment.investmentapp.entity.StockHolding;
import com.customer.investment.investmentapp.exception.StockServiceException;
import com.customer.investment.investmentapp.repository.InvestmentAccountRepository;
import com.customer.investment.investmentapp.repository.OrderRepository;
import com.customer.investment.investmentapp.repository.StockHoldingRepository;

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
	private StockHoldingRepository stockHoldingRepository;
	private InvestmentAccountRepository investmentAccountRepository;

	@Autowired
	public StockServiceImpl(Map<String, Double> stockPriceMap,
			CustomApplicationProperties customApplicationProperties,
			OrderRepository orderRepository,
			StockHoldingRepository stockHoldingRepository,
			InvestmentAccountRepository investmentAccountRepository) {
		this.stockPriceMap = stockPriceMap;
		this.stockProperties = customApplicationProperties.getStock();
		this.orderRepository = orderRepository;
		this.stockHoldingRepository = stockHoldingRepository;
		this.investmentAccountRepository = investmentAccountRepository;
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
	@Transactional
	public boolean placeStockOrder(OrderStockRequestDTO orderRequest){
		boolean isOrderSuccess = false;
		int currentQuanitytInHolding = 0;
		InvestmentAccount investmentAccount = investmentAccountRepository.getById(orderRequest.getAccountId());
		
		Optional<StockHolding> shOptional = stockHoldingRepository.findByStockSymbol(orderRequest.getStockSymbol());
		StockHolding sh = null;
		if(shOptional.isPresent()){
			sh = shOptional.get();
			currentQuanitytInHolding = sh.getQuantity();
		}
		else{			
			sh = new StockHolding();
			sh.setStockSymbol(orderRequest.getStockSymbol());
			sh.setInvestmentAccount(investmentAccount);			
		}
		currentQuanitytInHolding+=orderRequest.getNumberOfStock();
		sh.setQuantity(currentQuanitytInHolding);
		stockHoldingRepository.save(sh);
		
		/*Order newOrder = new Order(); 
		newOrder.setQuantity(orderRequest.getNumberOfStock());
		newOrder.setStockPrice(fetchCurrentStockPrice(orderRequest.getStockSymbol()));
		newOrder.setStockSymbol(orderRequest.getStockSymbol());
		newOrder.setInvestmentAccount(investmentAccount);
		orderRepository.save(newOrder);*/
		isOrderSuccess = true;
		return isOrderSuccess;
	}

}
