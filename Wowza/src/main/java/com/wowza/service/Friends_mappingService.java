package com.wowza.service;

import java.util.ArrayList;

import com.wowza.model.Friends;
import com.wowza.model.Friends_mapping;
import com.wowza.model.User;

public interface Friends_mappingService {
	
	Iterable<Friends_mapping> list();
	
	Friends_mapping save(Friends_mapping friends_mapping);

	Iterable<Friends> getFriendList(String user_id);

	ArrayList<User> getFriendsListByUserId(String user_id);

}
