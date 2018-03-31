package com.wowza.service;

import com.wowza.model.Comment;
import com.wowza.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
	
	private CommentRepository commentRepository;
	
	public CommentServiceImpl(CommentRepository commentRepository) {
		this.commentRepository=commentRepository;
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
