package com.customer.investment.investmentapp.serviceImpl;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.dtos.CommonResponseDto;
import com.customer.investment.investmentapp.dtos.LoginRequestDto;
import com.customer.investment.investmentapp.entity.UserDetails;
import com.customer.investment.investmentapp.exception.UserNotFoundException;
import com.customer.investment.investmentapp.repository.UserRepository;
import com.customer.investment.investmentapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.validation.Valid;

/**
 * @author Shankar, , , ,
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;



    /**
     *
     * @param userId
     * @return the list of accounts
     * @implSpec When a valid userId is passed the list of all of the accounts
     * against the usedId would be returned
     */
    @Override
    public List<AccountDetailsResponseDTO> getUserAccounts(int userId) {
        log.info("Inside method getUSerAccounts of UserServiceImpl class with userId : {} ", userId);
        try {

        }catch (Exception e){

        }
        return null;
    }

    /**
     * @param userId
     * @return boolean value if user exists
     */
    @Override
    public boolean userExists(Integer userId) {
        return userRepository.existsById(userId);
    }
    
    @Override
	public CommonResponseDto userLogin(@Valid LoginRequestDto loginRequestDto) {
		UserDetails userDetails = new UserDetails();

		BeanUtils.copyProperties(loginRequestDto, userDetails);
		UserDetails userDetailsfromDB = userRepository.findByLoginIdAndPassword(userDetails.getLoginId(),
				userDetails.getPassword());
		if(userDetailsfromDB == null) {
			throw new UserNotFoundException("Invalid credentials. Please try with valid credentials.");
		}
		
		return new CommonResponseDto("Successfully Login",200);
	}
}
