package com.wowza.service;

import com.wowza.model.User_to_video;

public interface User_to_videoService {
	
	Iterable<User_to_video> list();
	
	User_to_video save(User_to_video user_to_video);

}
