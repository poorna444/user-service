package com.practice.userservice.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.usercore.domain.User;
import com.practice.usercore.domain.UserSearchCriteria;
import com.practice.userservice.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public Long createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getUsers(UserSearchCriteria searchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidUser(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserInfo(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
