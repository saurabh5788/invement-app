package com.customer.investment.investmentapp.repository;

import com.customer.investment.investmentapp.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {

	public UserDetails findByLoginIdAndPassword(String loginId,String password);
}
