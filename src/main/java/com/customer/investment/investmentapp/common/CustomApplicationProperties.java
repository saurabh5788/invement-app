package com.customer.investment.investmentapp.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:custom.properties")
@ConfigurationProperties(prefix = "investment-app")
public class CustomApplicationProperties {

    private String noUserExist;

    public String getNoUserExist() {
        return noUserExist;
    }

    public void setNoUserExist(String noUserExist) {
        this.noUserExist = noUserExist;
    }
}
