/**
 * 
 */
package com.hcl.funds.fundstransfernew.service;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.funds.fundstransfernew.dto.UserRequestDTO;
import com.hcl.funds.fundstransfernew.dto.UserResponseDTO;
import com.hcl.funds.fundstransfernew.entity.Account;
import com.hcl.funds.fundstransfernew.entity.User;
import com.hcl.funds.fundstransfernew.repository.AccountReposiory;
import com.hcl.funds.fundstransfernew.repository.UserRegistrationReposiory;

import junit.framework.Assert;

/**
 * @author User1
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	@Autowired
	private UserRegistrationReposiory userRegistrationReposiory;
	@Autowired
	private AccountReposiory accountReposiory;

	@InjectMocks
	UserServiceImpl userServiceImpl;
	@Test
	public void testUserRegistration() {
	
		UserRequestDTO userRequestDTO=new UserRequestDTO();
		userRequestDTO.setUserName("srinivasa");
		userRequestDTO.setEmail("srpokala1143@gmail.com");
		userRequestDTO.setGender("male");
		userRequestDTO.setPhoneNumber(63156L);
		
		User user=new User();
		user.setEmail("srpokala1143@gmail.com");
		user.setGender("male");
		user.setPassword("srini");
		user.setPhoneNumber(63156L);
		user.setUserId(1L);
		user.setUserName("srini");
		Optional<User> optionalUser= Optional.of(user);
		
		Account account=new Account();
		account.setAccountId(1);
		account.setAccountNumber(12345L);
		account.setBalance(120.00);
		account.setBranchName("ponnur");
		account.setUser(user);	
		Mockito.when(userRegistrationReposiory.findByUserName("srinivasa")).thenReturn(optionalUser);
		Mockito.when(userRegistrationReposiory.save(user)).thenReturn(user);
				
	//	Mockito.when(accountReposiory.save(account)).thenReturn(account);
		Mockito.doNothing().when(accountReposiory.save(account));
		
		UserResponseDTO userRegistration = userServiceImpl.userRegistration(userRequestDTO);
		Assert.assertNotNull(userRegistration);
		Assert.assertEquals("user successfully registered", userRegistration.getStatusMessage());
	}

}
