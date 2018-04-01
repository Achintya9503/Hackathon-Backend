package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wowza.model.User_to_video;

@Repository
public interface User_to_videoRepository extends CrudRepository<User_to_video, Long> {
}
