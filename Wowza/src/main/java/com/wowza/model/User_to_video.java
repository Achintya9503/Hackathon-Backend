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
	private long s_no;
	@Column(nullable=false)
	private long video_id;
	@Column(nullable=false)
	private long user_id;
	@Column(nullable=false)
	private boolean owner;
	
	public User_to_video() {
		
	}

}
