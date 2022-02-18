package com.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.security.model.User;

@Service
public class UserService {

	private List<User> users = new ArrayList<>();

	public UserService() {
		users.add(new User("rahul", "rahulchauhan", "rchahan@gmail.com", "NORMAL"));
		users.add(new User("kiran", "kiranchauhan", "kc75633@gmail.com", "ADMIN"));
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUser(String username) {
		return users.stream().filter(u -> u.getUsername().compareTo(username) == 0).findAny().get();
	}

	public List<User> addUser(User user) {
		users.add(user);
		return users;
	}

}
