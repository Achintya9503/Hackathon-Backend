package com.wowza.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wowza.model.Friends_mapping;
@Repository
public interface Friends_mappingRepository extends CrudRepository<Friends_mapping, Long> {
}
