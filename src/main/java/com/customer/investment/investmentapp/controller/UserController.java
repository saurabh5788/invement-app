package com.customer.investment.investmentapp.controller;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Shankar , , , ,
 * @version 1.0
 * <p>This class is a User Controller which would handle all the
 * request related to the user</p>
 */
@RestController
@RequestMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}/accounts")
    public ResponseEntity<?> getUserAccounts(@NonNull @RequestParam("userId") Integer userId){
        if(userId != null || userId <1 || !userService.userExists(userId)){

        }
        List<AccountDetailsResponseDTO> accountList =  userService.getUserAccounts(userId);

        return null;
    }
    
  //  @GetMapping("/{userId}/orderhistory")
    


}
