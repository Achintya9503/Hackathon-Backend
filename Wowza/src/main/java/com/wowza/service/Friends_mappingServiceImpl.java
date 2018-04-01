package com.wowza.service;

import com.wowza.model.Friends;
import com.wowza.model.Friends_mapping;
import com.wowza.repository.Friends_mappingRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Friends_mappingServiceImpl implements Friends_mappingService{

	@Autowired
	private SessionFactory sessionFactory;

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

	@Override
	public Iterable<Friends> getFriendList(long user_id){
		Session session = sessionFactory.openSession();
		String hql = "select F.friend_id FROM F.friends_mapping where F.user_id = '" +user_id+ "' and F.pending = '" +false+ "'";
		Iterable result = session.createQuery(hql).list();
		return result;
	}

}
