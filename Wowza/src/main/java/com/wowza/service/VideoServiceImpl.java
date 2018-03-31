package com.wowza.service;

import com.wowza.model.Video;
import com.wowza.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService{

	private VideoRepository videoRepository;

	public VideoServiceImpl(VideoRepository videoRepository) {
		this.videoRepository=videoRepository;
	}

	@Override
	public Iterable<Video> list() {
		Iterable<Video> lst = this.videoRepository.findAll();
		for(Video video:lst) {
			System.out.println(video.toString());
		}
		return this.videoRepository.findAll();
	}

	@Override
	public Video save(Video video) {
		return this.videoRepository.save(video);
	}

}
