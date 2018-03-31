package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wowza.model.Liked;

public interface LikedRepository extends CrudRepository<Liked, Long> {
}
