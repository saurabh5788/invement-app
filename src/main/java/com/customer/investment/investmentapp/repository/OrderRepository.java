package com.customer.investment.investmentapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.investment.investmentapp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
