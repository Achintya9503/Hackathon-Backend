package com.wowza.service;

import com.wowza.model.User_to_video;
import com.wowza.repository.User_to_videoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_to_videoServiceImpl implements User_to_videoService{
	
	@Autowired
	User_to_videoRepository user_to_videoRepository;

	public User_to_videoServiceImpl() {
		
	}

	@Override
	public Iterable<User_to_video> list() {
		Iterable<User_to_video> lst = this.user_to_videoRepository.findAll();
		for(User_to_video user_to_video:lst) {
			System.out.println(user_to_video.toString());
		}
		return this.user_to_videoRepository.findAll();
	}

	@Override
	public User_to_video save(User_to_video user_to_video) {
		return this.user_to_videoRepository.save(user_to_video);
	}

}
