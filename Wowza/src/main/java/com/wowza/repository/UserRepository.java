package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wowza.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	public User findByUserId(long user_id);

}
