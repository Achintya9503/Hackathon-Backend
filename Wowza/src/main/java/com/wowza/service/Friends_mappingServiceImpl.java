package com.wowza.service;

import com.wowza.model.Friends;
import com.wowza.model.Friends_mapping;
import com.wowza.model.User;
import com.wowza.repository.Friends_mappingRepository;
import com.wowza.repository.UserRepository;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Friends_mappingServiceImpl implements Friends_mappingService{


	@Autowired
	Friends_mappingRepository friends_mappingRepository;
	
//	private UserRepository userRepository;
//	private UserServiceImpl userService = new UserServiceImpl(userRepository);
	
	@Autowired
	UserServiceImpl userService;
	

	public Friends_mappingServiceImpl() {
		
	}

	@Override
	public Iterable<Friends_mapping> list() {
		Iterable<Friends_mapping> lst = this.friends_mappingRepository.findAll();
		for(Friends_mapping friends_mapping:lst) {
			System.out.println(friends_mapping.toString());
		}
		return this.friends_mappingRepository.findAll();
	}

	@Override
	public Friends_mapping save(Friends_mapping friends_mapping) {
		return this.friends_mappingRepository.save(friends_mapping);
	}


	@Override
	public ArrayList<User> getFriendsListByUserId(long user_id){
		ArrayList<User> friendsList = new ArrayList<User>();
		try {
		Iterable<Friends_mapping> lst = this.friends_mappingRepository.findByUserId(user_id);
		Iterable<Friends_mapping> lst1 = this.friends_mappingRepository.findByFriendId(user_id);
		System.out.println(lst.toString());
		if(lst!=null) {
			System.out.println("friends found");
			for(Friends_mapping friends :lst) {
				System.out.println(friends.getFriendId());
				User friend = userService.getUserByID(friends.getFriendId());
				friendsList.add(friend);
			}
			
		}
		if(lst1!=null) {
			System.out.println("friends found");
			for(Friends_mapping friends :lst1) {
				System.out.println(friends.getUserId());
				User friend = userService.getUserByID(friends.getUserId());
				friendsList.add(friend);
			}
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return friendsList;
		
	}

	@Override
	public Iterable<Friends> getFriendList(long user_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
