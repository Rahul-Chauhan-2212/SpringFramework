package com.spring.framework.springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.framework.springmvc.dao.UserDao;
import com.spring.framework.springmvc.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	@Override
	public int createUser(User user) {
		return this.userDao.createUser(user);
	}

}
