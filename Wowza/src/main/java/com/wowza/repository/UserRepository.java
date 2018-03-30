package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;

import com.wowza.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
