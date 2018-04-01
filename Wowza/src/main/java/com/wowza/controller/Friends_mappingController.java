package com.wowza.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wowza.model.Friends;
import com.wowza.model.Friends_mapping;
import com.wowza.model.User;
import com.wowza.service.Friends_mappingService;
import com.wowza.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/api/friendsMapping")
public class Friends_mappingController {

	private Friends_mappingService friends_mappingService;
	private UserService userService;

	public Friends_mappingController(Friends_mappingService friends_mappingService) {
		this.friends_mappingService = friends_mappingService;
	}

	@GetMapping("/getFriends")
	public Iterable<Friends_mapping> list() {
		System.out.println("List:");
		return this.friends_mappingService.list();
	}

	@PostMapping("/save")
	public Friends_mapping saveTask(@RequestBody Friends_mapping friends_mapping) {
		return this.friends_mappingService.save(friends_mapping);
	}

	@GetMapping(value = "/getFriendList/{user_id}")
	@ResponseBody
	@JsonIgnoreProperties
	public Iterable<Friends> getFriendList(@PathVariable("user_id") long user_id) {

//		Iterable<User> users = userService.list();
//		Iterator<User> userIterator = users.iterator();
//		Iterable<Friends> friends = null;
//		while (userIterator.hasNext()) {
//			System.out.println(userIterator.next());
//			if (userIterator.next()) {
//			}
//			return friends;
//		}
		return  this.friends_mappingService.getFriendList(user_id);

	}
}
