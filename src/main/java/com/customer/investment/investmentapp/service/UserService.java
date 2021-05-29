package com.customer.investment.investmentapp.service;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    List<AccountDetailsResponseDTO> getUserAccounts(int userId);

    boolean userExists( Integer userId);

}
