package com.customer.investment.investmentapp.repository;

import com.customer.investment.investmentapp.entity.InvestmentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentAccountRepository extends JpaRepository<InvestmentAccount, Integer> {



}
