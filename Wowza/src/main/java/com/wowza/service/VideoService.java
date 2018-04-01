package com.wowza.service;

import com.wowza.model.Video;

public interface VideoService {
	
	Iterable<Video> list();
	
	Video save(Video video);

}
