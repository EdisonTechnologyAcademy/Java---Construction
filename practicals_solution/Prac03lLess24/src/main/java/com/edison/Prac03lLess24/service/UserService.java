package com.edison.Prac03lLess24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edison.Prac03lLess24.model.User;
import com.edison.Prac03lLess24.repository.UserRepository;




@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}	

}
