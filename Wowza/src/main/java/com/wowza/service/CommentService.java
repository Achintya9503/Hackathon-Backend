package com.wowza.service;

import com.wowza.model.Comment;

public interface CommentService {
	
	Iterable<Comment> list();
	
	Comment save(Comment comment);

}
