package com.customer.investment.investmentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class PortfolioController {

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "welcome to investment-app";
    }




}
