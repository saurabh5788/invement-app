package com.customer.investment.investmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.investment.investmentapp.entity.InvestmentAccount;


public interface InvestmentAccountRepository extends JpaRepository<InvestmentAccount, Integer> {

	
}