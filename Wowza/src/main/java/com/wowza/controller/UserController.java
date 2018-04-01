package com.wowza.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowza.model.User;
import com.wowza.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public Iterable<User> list(){
		System.out.println("List:");
		return this.userService.list();
	}
	
	@GetMapping("/getbyid/{user_id}")
	public User list(@PathVariable("user_id") long user_id){
		return this.userService.getUserByID(user_id);
	}
	
	
	
	@PostMapping("/save")
	public User saveTask(@RequestBody  User user) {
		return this.userService.save(user);
	}
	
	@GetMapping("/users/{user_id}")
	public Iterable<User> getUsers(@PathVariable("user_id") long user_id){
		System.out.println("List:");
		return this.userService.getUsersList(user_id);
	}

}
