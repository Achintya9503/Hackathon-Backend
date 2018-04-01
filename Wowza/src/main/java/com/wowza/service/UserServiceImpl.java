package com.wowza.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wowza.model.Response;
import com.wowza.model.User;
import com.wowza.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	// private Friends_mappingRepository friends_mappingRepository;
	// private Friends_mappingServiceImpl friendsService = new
	// Friends_mappingServiceImpl(friends_mappingRepository);
	@Autowired
	Friends_mappingServiceImpl friendsService;

	public UserServiceImpl() {

	}

	@Override
	public Iterable<User> list() {
		Iterable<User> lst = this.userRepository.findAll();
		for (User user : lst) {
			System.out.println(user.toString());
		}
		return this.userRepository.findAll();
	}

	@Override
	public Response save(User user) {
		this.userRepository.save(user);
		return new Response(200, "ok");
	}

	@Override
	public Iterable<User> getUsersList(String user_id) {
		try {
			Iterable<User> lst = this.userRepository.findAll();
			ArrayList<User> friendsList = friendsService.getFriendsListByUserId(user_id);
			Iterator<User> iterator = lst.iterator();
			while (iterator.hasNext()) {
				User user = iterator.next();
				if (user.getUid().equals(user_id)) {
					iterator.remove();
				} else if (friendsList.contains(user)) {
					iterator.remove();
				}
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByID(String user_id) {
		return this.userRepository.findByuid(user_id);
	}

}
