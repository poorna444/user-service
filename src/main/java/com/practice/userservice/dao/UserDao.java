package com.practice.userservice.dao;

import java.util.List;

import com.practice.usercore.domain.User;
import com.practice.usercore.domain.UserSearchCriteria;

public interface UserDao {
	
	
	Long createUser(User user);
	
	boolean updateUser(User user);
	
	List<User> getUsers(UserSearchCriteria searchCriteria);
	
	boolean isValidUser(String userName,String password);
	
	User getUserInfo(Long userId);

}
