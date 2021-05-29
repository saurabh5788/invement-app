package com.customer.investment.investmentapp.controller;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.dtos.ErrorResponseDTO;
import com.customer.investment.investmentapp.entity.InvestmentAccount;
import com.customer.investment.investmentapp.repository.InvestmentAccountRepository;
import com.customer.investment.investmentapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * @author Shankar , , , ,
 * @version 1.0
 * <p>This class is a User Controller which would handle all the
 * request related to the user</p>
 */
@RestController
@RequestMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;


    @GetMapping("/{userId}/accounts")
    public ResponseEntity<?> getUserAccounts(@PathVariable Integer userId){
        log.info("Inside method getUserAccounts for userId : {} , of UserController Class" , userId);
        if( userId == null || userId <1 || !userService.userExists(userId) ){
            log.info("Request parameter invalid or user does not exist with userId! : {} ", userId);
            return ResponseEntity.badRequest().body(new ErrorResponseDTO("Malformed request", HttpStatus.BAD_REQUEST.value()));
        }
        return ResponseEntity.ok(userService.getUserAccounts(userId));
    }
    
  //  @GetMapping("/{userId}/orderhistory")
    


}
