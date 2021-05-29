package com.customer.investment.investmentapp.controller;


import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;


@WebMvcTest(value = UserController.class)
public class UserControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void whenUserIdIsPassedThenReturnTheListOfAccounts(){
        List<AccountDetailsResponseDTO> accountDetails = new ArrayList<>();
        accountDetails.add(new AccountDetailsResponseDTO("1234AC", 5140.85));
        accountDetails.add(new AccountDetailsResponseDTO("9858AC", 3000));

        Assertions.assertEquals(0, userService.getUserAccounts(1).size());
    }



}
