package com.customer.investment.investmentapp.serviceImpl;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    /**
     *
     * @param userId
     * @return the list of accounts
     * @implSpec When a valid userId is passed the list of all of the accounts
     * against the usedId would be returned
     */
    @Override
    public List<AccountDetailsResponseDTO> getUserAccounts(int userId) {
        return null;
    }
}
