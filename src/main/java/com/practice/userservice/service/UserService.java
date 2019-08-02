package com.practice.userservice.service;

import java.util.List;

import com.practice.usercore.domain.User;
import com.practice.usercore.domain.UserSearchCriteria;
import com.practice.usercore.exception.UserException;

public interface UserService {
	
	/**
	 * @param user
	 * @return userId
	 * @throws UserException
	 */
	Long createUser(User user)throws UserException;
	
	/**
	 * @param user
	 * @return true if updated successfully otherwise false
	 * @throws UserException
	 */
	boolean updateUser(User user) throws UserException;
	
	/**
	 * @param searchCriteria
	 * @return List of users with given criteria
	 * @throws UserException
	 */
	List<User> getUsers(UserSearchCriteria searchCriteria) throws UserException;
	
	
	boolean isValidUser(String userName,String password) throws UserException;
	
	User getUserInfo(Long userId) throws UserException;
	
	
	
	

}
