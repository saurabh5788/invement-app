package com.customer.investment.investmentapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Exception class to handle various errors in StockService.
 * @author Saurabh Singh
 *
 */
public class StockServiceException extends ResponseStatusException {
	private static final long serialVersionUID = 530873763491531686L;

	public StockServiceException(String reason) {
		super(HttpStatus.INTERNAL_SERVER_ERROR, reason);
	}

	public StockServiceException(Throwable t) {
		super(HttpStatus.INTERNAL_SERVER_ERROR, "Case Service Error.", t);
	}
}
