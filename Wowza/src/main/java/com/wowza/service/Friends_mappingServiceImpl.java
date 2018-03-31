package com.wowza.service;

import com.wowza.model.Friends_mapping;
import com.wowza.repository.Friends_mappingRepository;
import org.springframework.stereotype.Service;

@Service
public class Friends_mappingServiceImpl implements Friends_mappingService{

	private Friends_mappingRepository friends_mappingRepository;

	public Friends_mappingServiceImpl(Friends_mappingRepository friends_mappingRepository) {
		this.friends_mappingRepository=friends_mappingRepository;
	}

	@Override
	public Iterable<Friends_mapping> list() {
		Iterable<Friends_mapping> lst = this.friends_mappingRepository.findAll();
		for(Friends_mapping friends_mapping:lst) {
			System.out.println(friends_mapping.toString());
		}
		return this.friends_mappingRepository.findAll();
	}

	@Override
	public Friends_mapping save(Friends_mapping friends_mapping) {
		return this.friends_mappingRepository.save(friends_mapping);
	}

}
