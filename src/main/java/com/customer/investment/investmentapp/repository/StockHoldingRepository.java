package com.customer.investment.investmentapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.investment.investmentapp.entity.StockHolding;



public interface StockHoldingRepository extends JpaRepository<StockHolding, Long> {
	Optional<StockHolding> findByStockSymbol(String stockSymbol);
	
}