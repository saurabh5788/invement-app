/*
package com.customer.investment.investmentapp.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.investment.investmentapp.common.CustomApplicationProperties;
import com.customer.investment.investmentapp.dtos.OrderStockRequestDTO;
import com.customer.investment.investmentapp.service.StockService;

*/
/**
 * API Controller for Order Details
 * @author Saurabh Singh
 *//*

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class OrderController {
	
	private StockService stockService;
	private Map<String, String> userProperties;

	@Autowired
	public OrderController(StockService stockService, CustomApplicationProperties customApplicationProperties) {
		this.stockService = stockService;
		this.userProperties = customApplicationProperties.getUser();
	}

	@PostMapping(value = "/users/{userid}/orders", consumes = 
			MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> placeOrder(@PathVariable("userid") Integer userId,
			@Valid @RequestBody OrderStockRequestDTO orderStockRequestDTO) {
		if (userId == null || userId < 1) {
			return ResponseEntity.badRequest().build();
		}
		boolean orderPlacedStatus = stockService.placeStockOrder(orderStockRequestDTO);
		if (orderPlacedStatus)
			return ResponseEntity.ok().build();
		else
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.build();
	}
}
*/
