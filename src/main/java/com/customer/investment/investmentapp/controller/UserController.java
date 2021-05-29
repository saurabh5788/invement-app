package com.customer.investment.investmentapp.controller;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.dtos.CommonResponseDto;
import com.customer.investment.investmentapp.dtos.LoginRequestDto;
import com.customer.investment.investmentapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.validation.Valid;

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
    public ResponseEntity<?> getUserAccounts(@NonNull @RequestParam("userId") Integer userId){
        if(userId != null || userId <1 || !userService.userExists(userId)){

        }
        List<AccountDetailsResponseDTO> accountList =  userService.getUserAccounts(userId);

        return null;
    }
    
  //  @GetMapping("/{userId}/orderhistory")
    
    @PostMapping("/login")
    public ResponseEntity<CommonResponseDto> userLogin(@Valid @RequestBody LoginRequestDto loginRequestDto){
    	log.info("In userLogin method");
    	CommonResponseDto commonResponseDto= userService.userLogin(loginRequestDto);
    	return new ResponseEntity<>(commonResponseDto, HttpStatus.OK);
    }

}
