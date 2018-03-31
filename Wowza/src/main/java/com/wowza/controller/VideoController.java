package com.wowza.controller;

import com.wowza.model.Video;
import com.wowza.service.VideoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/video")
public class VideoController {
	
	private VideoService videoService;
	
	public VideoController(VideoService videoService) {
		this.videoService = videoService;
	}

	@GetMapping("/getUsers")
	public Iterable<Video> list(){
		System.out.println("List:");
		return this.videoService.list();
	}
	
	@PostMapping("/save")
	public Video saveTask(@RequestBody  Video video) {
		return this.videoService.save(video);
	}

}
