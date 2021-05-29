package com.customer.investment.investmentapp.common;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:custom.properties")
@ConfigurationProperties(prefix = "custom")
public class CustomApplicationProperties {
	private Map<String, String> user;
	private Map<String, String> stock;

	public Map<String, String> getUser() {
		return user;
	}

	public void setUser(Map<String, String> user) {
		this.user = user;
	}

	public Map<String, String> getStock() {
		return stock;
	}

	public void setStock(Map<String, String> stock) {
		this.stock = stock;
	}
}
