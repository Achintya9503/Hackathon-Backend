package com.wowza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wowza.model.Response;
import com.wowza.model.User;
import com.wowza.service.UserService;
import com.wowza.service.Util;
import com.wowza.service.fcm.AndroidPushNotificationsService;

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
	
	@GetMapping("/getbyid")
	public User list(@RequestHeader(value="token") String tokenId) throws InterruptedException{
		String UserId = util.getUId(tokenId);
		return this.userService.getUserByID(UserId);
	}
	
	@Autowired
	AndroidPushNotificationsService androidPushNotificationsService;
	
	@PutMapping("/streaming/{streaming}")
	public Response userStreaming(@RequestHeader(value="token") String tokenId,@PathVariable("streaming") String streaming) throws InterruptedException {
		String user_id = util.getUId(tokenId);
		User user = this.userService.getUserByID(user_id);
		user.setStreaming(streaming);
		Response response =  this.userService.save(user);
		if(streaming.equalsIgnoreCase("true")) {
			System.out.println("streaming ON");
			androidPushNotificationsService.send(user);
		}
		return response;
	}
	
	
	@PostMapping("/save")
	public Response saveTask(@RequestBody  User user) {
		user.setStreaming("false");
		User userTemp = this.userService.getUserByID(user.getUid());
		if(userTemp != null) {
			user.setUserId(userTemp.getUserId());
		}
		return this.userService.save(user);
	}
	
	@GetMapping("/exploreFriends")
	public Iterable<User> getUsers(@RequestHeader(value="token") String tokenId) throws InterruptedException{
		String user_id = util.getUId(tokenId);
		System.out.println("List:");
		return this.userService.getUsersList(user_id);
	}

}
