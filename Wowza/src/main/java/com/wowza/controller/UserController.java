package com.wowza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowza.model.User;
import com.wowza.service.UserService;
import com.wowza.service.Util;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	Util util;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/getallusers")
	public Iterable<User> list(){
		System.out.println("List:");
		return this.userService.list();
	}
	
	@GetMapping("/getbyid/{tokenId}")
	public User list(@PathVariable("tokenId") String tokenId) throws InterruptedException{
		String UserId = util.getUId(tokenId);
		return this.userService.getUserByID(UserId);
	}
	
	@PutMapping("/isstreaming/{tokenId}/{streaming}")
	public User userStreaming(@PathVariable("tokenId") String tokenId,@PathVariable("tokenId") String streaming) throws InterruptedException {
		String user_id = util.getUId(tokenId);
		User user = this.userService.getUserByID(user_id);
		user.setStreaming(streaming);
		return this.userService.save(user);
	}
	
	
	@PostMapping("/save")
	public User saveTask(@RequestBody  User user) {
		user.setStreaming("false");
		return this.userService.save(user);
	}
	
	@GetMapping("/users/{tokenId}")
	public Iterable<User> getUsers(@PathVariable("tokenId") String tokenId) throws InterruptedException{
		String user_id = util.getUId(tokenId);
		System.out.println("List:");
		return this.userService.getUsersList(user_id);
	}

}
