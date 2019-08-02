package com.practice.user_service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.practice.usercore.exception.UserException;
import com.practice.userservice.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	
	@Test
	public void testCreateUser() throws UserException {
		userService.createUser(null);
	}
}


@Configuration
@ComponentScan(basePackages = {"com.practice"})
class AppConfig{
	
}
