package com.customer.investment.investmentapp.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginRequestDto {

	@NotBlank(message = "Login Id should not be blank")
	@NotNull(message = "Login Id should not be null")
	@NotEmpty(message = "Login Id should not be empty")
	private String loginId;
	
	@NotBlank(message = "Password should not be blank")
	@NotNull(message = "Password should not be null")
	@NotEmpty(message = "Password should not be empty")
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param loginId
	 * @param password
	 */
	public LoginRequestDto(
			@NotBlank(message = "Login Id should not be blank") @NotNull(message = "Login Id should not be null") @NotEmpty(message = "Login Id should not be empty") String loginId,
			@NotBlank(message = "Password should not be blank") @NotNull(message = "Password should not be null") @NotEmpty(message = "Password should not be empty") String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	
	
}
