package com.wowza.service;

import java.util.ArrayList;
import java.util.List;

import com.wowza.model.Response;
import com.wowza.model.User;

public interface UserService {
	
	Iterable<User> list();
	
	Response save(User user);
	
	ArrayList<User> getUsersList(String user_id);
	
	User getUserByID(String userId);

}
