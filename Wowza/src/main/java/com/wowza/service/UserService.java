package com.wowza.service;

import com.wowza.model.User;

public interface UserService {
	
	Iterable<User> list();
	
	User save(User user);

}
