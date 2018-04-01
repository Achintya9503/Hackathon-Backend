package com.wowza.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wowza.model.Friends_mapping;
import com.wowza.model.User;
import com.wowza.repository.Friends_mappingRepository;
import com.wowza.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
//	private Friends_mappingRepository friends_mappingRepository;
//	private Friends_mappingServiceImpl friendsService = new Friends_mappingServiceImpl(friends_mappingRepository);
	@Autowired
	Friends_mappingServiceImpl friendsService; 
	
	public UserServiceImpl() {
		
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

	@Override
	public ArrayList<User> getUsersList(String user_id) {
		ArrayList<User> listOfUsers = new ArrayList<User>();
		try {
		Iterable<User> lst = this.userRepository.findAll();
		ArrayList<String> userList = new ArrayList<String>();
		for(User user:lst) {
			System.out.println(user.getUId());
			userList.add(user.getUId());
		}
		System.out.println(userList.toString());
		userList.remove(user_id);
		ArrayList<User> friendsList = friendsService.getFriendsListByUserId(user_id);
		System.out.println(friendsList.toString());
		for(User friends :friendsList) {
			System.out.println(friends.getUserId());
			userList.remove(friends.getUserId());
		}
		System.out.println(userList.toString());
		
		for(String id:userList) {
			User noFriend = getUserByID(id);
			listOfUsers.add(noFriend);
		}
		System.out.println(listOfUsers.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listOfUsers;
		
	}

	@Override
	public User getUserByID(String user_id) {
		return this.userRepository.findByUId(user_id);
	}

}
