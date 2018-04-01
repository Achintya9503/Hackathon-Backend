package com.wowza.service;

import java.util.ArrayList;
import java.util.List;

import com.wowza.model.User;

public interface UserService {
	
	Iterable<User> list();
	
	User save(User user);
	
	ArrayList<User> getUsersList(long user_id);
	
	User getUserByID(long user_id);

}
