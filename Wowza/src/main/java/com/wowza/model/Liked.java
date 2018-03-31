package com.wowza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Liked {
	
	@Id
	private long user_id;
	@Column(nullable=false)
	private long video_id;
	@Column(nullable=true)
	private boolean is_liked;
	@Column(nullable=true)
	private boolean is_disliked;
	
	public Liked() {
		
	}

}
