package com.wowza.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wowza.model.Friends_mapping;
import com.wowza.model.User;
import com.wowza.service.Friends_mappingService;
import com.wowza.service.Util;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friendsMapping")
public class Friends_mappingController {

	private Friends_mappingService friends_mappingService;

	@Autowired
	Util util;
	
	public Friends_mappingController(Friends_mappingService friends_mappingService) {
		this.friends_mappingService = friends_mappingService;
	}

	@GetMapping("/getFriends")
	public Iterable<Friends_mapping> list() {
		System.out.println("List:");
		return this.friends_mappingService.list();
	}

	@PostMapping("/sendfriendrequest/{tokenId}/{friend_id}")
	public Friends_mapping saveTask(@PathVariable("tokenId") String tokenId,@PathVariable("friend_id") String friend_id) throws InterruptedException {
		Friends_mapping friendMapping = new Friends_mapping();
		String user_id = util.getUId(tokenId);
		friendMapping.setUserId(user_id);
		friendMapping.setFriendId(friend_id);
		return this.friends_mappingService.save(friendMapping);
	}

	@GetMapping(value = "/getFriendList/{tokenId}")
	@ResponseBody
	@JsonIgnoreProperties
	public ArrayList<User> getFriendList(@PathVariable("tokenId") String tokenId) throws InterruptedException {
		String user_id = util.getUId(tokenId);
		return  this.friends_mappingService.getFriendsListByUserId(user_id);

	}
}
