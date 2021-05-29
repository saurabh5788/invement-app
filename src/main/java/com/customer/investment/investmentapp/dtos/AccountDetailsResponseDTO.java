package com.customer.investment.investmentapp.dtos;

/**
 * @author Shankar [29-05-2021]
 * @version 1.0
 */
public class AccountDetailsResponseDTO {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountDetailsResponseDTO{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
