package com.wowza.service;


import com.wowza.model.Liked;

public interface LikedService {
	
	public Iterable<Liked> list();
	
	public Liked save(Liked liked);

}
