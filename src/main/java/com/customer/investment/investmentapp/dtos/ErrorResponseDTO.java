package com.customer.investment.investmentapp.dtos;


public class ErrorResponseDTO {

    public ErrorResponseDTO(String message, int httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    private String message;
    private int httpStatus;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }
}
