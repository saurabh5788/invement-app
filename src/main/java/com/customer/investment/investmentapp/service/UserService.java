package com.customer.investment.investmentapp.service;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.dtos.CommonResponseDto;
import com.customer.investment.investmentapp.dtos.LoginRequestDto;

import org.springframework.stereotype.Component;

import java.util.List;

import javax.validation.Valid;

@Component
public interface UserService {

    List<AccountDetailsResponseDTO> getUserAccounts(Integer userId);

    boolean userExists( Integer userId);
    
    CommonResponseDto userLogin(@Valid LoginRequestDto loginRequestDto);

}
