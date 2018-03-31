package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wowza.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
