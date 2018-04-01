package com.wowza.service;

import com.wowza.model.Comment;
import com.wowza.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepository commentRepository;
	
	public CommentServiceImpl() {
		
	}

	@Override
	public Iterable<Comment> list() {
		Iterable<Comment> lst = this.commentRepository.findAll();
		for(Comment comment:lst) {
			System.out.println(comment.toString());
		}
		return this.commentRepository.findAll();
	}

	@Override
	public Comment save(Comment comment) {
		return this.commentRepository.save(comment);
	}

}
