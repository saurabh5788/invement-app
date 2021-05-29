package com.customer.investment.investmentapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.investment.investmentapp.dtos.OrderStockRequestDTO;

/**
 * API Controller for Order Details.
 * 
 * @author Saurabh Singh
 */
@RestController
@RequestMapping(produces = 
		MediaType.APPLICATION_JSON_VALUE)
@Validated
public class OrderController {
	

	@Autowired
	public OrderController() {
	}

	@PostMapping(value = { "/add", "/add/" }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Void> updateStateCase(
			@Valid @RequestBody OrderStockRequestDTO orderStockRequestDTO) {
		return null;
	}
}
