package com.customer.investment.investmentapp.repository;

import com.customer.investment.investmentapp.entity.InvestmentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentAccountRepository extends JpaRepository<InvestmentAccount, Integer> {

    /**
     * @param userId
     * @return list of investment accounts for a user
     */

    @Query("select ua from InvestmentAccount ua where ua.userDetails.userId=?1")

    List<InvestmentAccount> getUserAccountByUserId(Integer userId);

}
