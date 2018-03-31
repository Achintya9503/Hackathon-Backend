package com.wowza.service;


import com.wowza.model.Liked;

public interface LikedService {
	
	Iterable<Liked> list();
	
	Liked save(Liked liked);

}
