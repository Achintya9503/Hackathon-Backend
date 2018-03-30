package com.wowza.service;

import com.wowza.model.User;

public interface UserService {
	
	public Iterable<User> list();
	
	public User save(User user);

}
