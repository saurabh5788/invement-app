package com.customer.investment.investmentapp.serviceImpl;

import com.customer.investment.investmentapp.dtos.AccountDetailsResponseDTO;
import com.customer.investment.investmentapp.entity.InvestmentAccount;
import com.customer.investment.investmentapp.entity.UserDetails;
import com.customer.investment.investmentapp.repository.InvestmentAccountRepository;
import com.customer.investment.investmentapp.repository.UserRepository;
import com.customer.investment.investmentapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Shankar, , , ,
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InvestmentAccountRepository investmentAccountRepository;

    /**
     *
     * @param userId
     * @return the list of accounts
     * @implSpec When a valid userId is passed the list of all of the accounts
     * against the usedId would be returned
     */
    @Override
    public List<AccountDetailsResponseDTO> getUserAccounts(Integer userId) {
        log.info("Inside method getUSerAccounts of UserServiceImpl class with userId : {} ", userId);
        List<AccountDetailsResponseDTO> userInvestmentAccountsList = new ArrayList<>();
        try {
            List<InvestmentAccount> userAccounts =  investmentAccountRepository.getUserAccountByUserId(userId);
           if(!userAccounts.isEmpty()) {
                for (InvestmentAccount account:userAccounts){
                    AccountDetailsResponseDTO accountDetailsResponseDTO = new AccountDetailsResponseDTO();
                    accountDetailsResponseDTO.setAccountNumber(account.getAccountNumber());
                    accountDetailsResponseDTO.setBalance(account.getAmount());
                    userInvestmentAccountsList.add(accountDetailsResponseDTO);
                }
               log.info("Mapped account entity values to InvestmentAccountResponseDTO");
               return userInvestmentAccountsList;
           }else{
               throw new EntityNotFoundException();
           }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return userInvestmentAccountsList;
    }

    /**
     * @param userId
     * @return boolean value if user exists
     */
    @Override
    public boolean userExists(Integer userId) {
        log.info("Inside method userExist of class UserServiceImpl with userID : {} ",userId);
        Optional<UserDetails> userDetails = userRepository.findById(userId);
        return userDetails.isPresent();
    }
}
