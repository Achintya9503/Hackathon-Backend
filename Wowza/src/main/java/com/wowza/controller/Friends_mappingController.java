package com.wowza.controller;

import com.wowza.model.Friends_mapping;
import com.wowza.service.Friends_mappingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friendsMapping")
public class Friends_mappingController {
	
	private Friends_mappingService friends_mappingService;
	
	public Friends_mappingController(Friends_mappingService friends_mappingService) {
		this.friends_mappingService = friends_mappingService;
	}

	@GetMapping("/getFriends")
	public Iterable<Friends_mapping> list(){
		System.out.println("List:");
		return this.friends_mappingService.list();
	}
	
	@PostMapping("/save")
	public Friends_mapping saveTask(@RequestBody  Friends_mapping friends_mapping) {
		return this.friends_mappingService.save(friends_mapping);
	}

}
