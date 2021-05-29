package com.customer.investment.investmentapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.investment.investmentapp.entity.Order;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {


	
}
