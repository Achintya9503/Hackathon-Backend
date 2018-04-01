package com.wowza.controller;

import com.wowza.model.User_to_video;
import com.wowza.service.User_to_videoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/userToVideo")
public class User_to_videoController {

	private User_to_videoService user_to_videoService;

	public User_to_videoController(User_to_videoService user_to_videoService) {
		this.user_to_videoService = user_to_videoService;
	}

	@GetMapping("/getVideos")
	public Iterable<User_to_video> list(){
		System.out.println("List:");
		return this.user_to_videoService.list();
	}
	
	@PostMapping("/save")
	public User_to_video saveTask(@RequestBody  User_to_video user_to_video) {
		return this.user_to_videoService.save(user_to_video);
	}

}
