package com.customer.investment.investmentapp.controller;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void whenUserIdIsPassedThenReturnTheListOfAccounts(){
        ResponseEntity accountDetails = userController.getUserAccounts(1);
        Assert.assertNotNull(accountDetails.getBody() != null);
    }

    @Test
    public void whenUserIdIsNullThenThrowReturnBadRequest(){
        ResponseEntity accountDetails = userController.getUserAccounts(null);
        Assert.assertTrue(accountDetails.getStatusCode().is4xxClientError());
    }




}
