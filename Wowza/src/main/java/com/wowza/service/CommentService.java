package com.wowza.service;

import com.wowza.model.Comment;

public interface CommentService {
	
	public Iterable<Comment> list();
	
	public Comment save(Comment comment);

}
