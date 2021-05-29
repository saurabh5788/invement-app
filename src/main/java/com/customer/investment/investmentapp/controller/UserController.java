package com.customer.investment.investmentapp.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {


    @GetMapping("/{userId}/accounts")
    public ResponseEntity<?> getUserAccounts(@NonNull @RequestParam("userId") Integer userId){
        return null;
    }


}
