package com.wowza.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wowza.model.Friends_mapping;
import com.wowza.model.User;
import com.wowza.service.Friends_mappingService;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friendsMapping")
public class Friends_mappingController {

	private Friends_mappingService friends_mappingService;


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
	public ArrayList<User> getFriendList(@PathVariable("user_id") long user_id) {

		return  this.friends_mappingService.getFriendsListByUserId(user_id);

	}
}
