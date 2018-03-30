package com.wowza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class User_to_video {
	
	@Id
	@Column(nullable=false)
	private long video_id;
	@Column(nullable=false)
	private long user_id;
	@Column(nullable=false)
	private boolean is_owner;
	
	public User_to_video() {
		
	}

}
