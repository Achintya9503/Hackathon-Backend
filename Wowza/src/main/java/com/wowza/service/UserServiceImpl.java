package com.wowza.service;

import org.springframework.stereotype.Service;

import com.wowza.model.User;
import com.wowza.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
	}

	@Override
	public Iterable<User> list() {
		Iterable<User> lst = this.userRepository.findAll();
		for(User user:lst) {
			System.out.println(user.toString());
		}
		return this.userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

}
