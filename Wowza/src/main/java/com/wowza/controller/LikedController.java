package com.wowza.controller;

import com.wowza.model.Liked;
import com.wowza.service.LikedService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/liked")
public class LikedController {

	private LikedService likedService;

	public LikedController(LikedService likedService) {
		this.likedService = likedService;
	}

	@GetMapping("/getLikes")
	public Iterable<Liked> list(){
		System.out.println("List:");
		return this.likedService.list();
	}
	
	@PostMapping("/save")
	public Liked saveTask(@RequestBody  Liked liked) {
		return this.likedService.save(liked);
	}

}
