package com.wowza.controller;

import com.wowza.model.Comment;
import com.wowza.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

	private CommentService commentService;

	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}

	@GetMapping("/getComments")
	public Iterable<Comment> list(){
		System.out.println("List:");
		return this.commentService.list();
	}
	
	@PostMapping("/save")
	public Comment saveTask(@RequestBody  Comment comment) {
		return this.commentService.save(comment);
	}

}
