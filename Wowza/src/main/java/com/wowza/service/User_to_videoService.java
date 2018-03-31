package com.wowza.service;

import com.wowza.model.User_to_video;

public interface User_to_videoService {
	
	public Iterable<User_to_video> list();
	
	public User_to_video save(User_to_video user_to_video);

}
