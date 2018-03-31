package com.wowza.service;

import com.wowza.model.Liked;
import com.wowza.repository.LikedRepository;
import org.springframework.stereotype.Service;

@Service
public class LikedServiceImpl implements LikedService{

	private LikedRepository likedRepository;

	public LikedServiceImpl(LikedRepository likedRepository) {
		this.likedRepository=likedRepository;
	}

	@Override
	public Iterable<Liked> list() {
		Iterable<Liked> lst = this.likedRepository.findAll();
		for(Liked liked:lst) {
			System.out.println(liked.toString());
		}
		return this.likedRepository.findAll();
	}

	@Override
	public Liked save(Liked liked) {
		return this.likedRepository.save(liked);
	}

}
