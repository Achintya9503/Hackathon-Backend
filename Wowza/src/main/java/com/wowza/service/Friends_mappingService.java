package com.wowza.service;

import com.wowza.model.Friends_mapping;

public interface Friends_mappingService {
	
	public Iterable<Friends_mapping> list();
	
	public Friends_mapping save(Friends_mapping friends_mapping);

}
