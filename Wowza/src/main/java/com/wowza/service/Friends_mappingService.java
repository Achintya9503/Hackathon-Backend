package com.wowza.service;

import com.wowza.model.Friends_mapping;

public interface Friends_mappingService {
	
	Iterable<Friends_mapping> list();
	
	Friends_mapping save(Friends_mapping friends_mapping);

}
