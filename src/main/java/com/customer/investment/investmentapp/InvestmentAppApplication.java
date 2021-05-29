package com.customer.investment.investmentapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvestmentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentAppApplication.class, args);
	}

	@Bean
	public Map<String,Double> stockPriceMap(){
		Map<String,Double> stockPriceMap = new HashMap<String,Double>();
		stockPriceMap.put("tesla",23.2);
		stockPriceMap.put("apple",20.9);
		stockPriceMap.put("gm",12.5);
		return stockPriceMap;
	}
	
}
