package com.wowza.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table (name="user_to_video")
@Data
@AllArgsConstructor
public class User_to_video {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="s_no")
	private long sNo;
	@Column(nullable=false, name="video_id")
	private long videoId;
	@Column(nullable=false, name="user_id")
	private long userId;
	@Column(nullable=false)
	private boolean owner;
	
	public User_to_video() {
		
	}

}
