package com.practice.userservice.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.usercore.domain.User;
import com.practice.usercore.domain.UserSearchCriteria;
import com.practice.usercore.exception.UserException;
import com.practice.userservice.dao.UserDao;
import com.practice.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static Logger log = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public Long createUser(User user) throws UserException {
		// validate User before calling db method
		return userDao.createUser(user);
	}

	@Override
	public boolean updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUsers(UserSearchCriteria searchCriteria) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidUser(String userName, String password) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserInfo(Long userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
