package com.wowza.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="liked")
@Data
@AllArgsConstructor
public class Liked {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="user_id")
	private long userId;
	@Column(nullable=false, name="video_id")
	private long videoId;
	@Column(nullable=true)
	private boolean liked;
	@Column(nullable=true)
	private boolean disliked;
	
	public Liked() {
		
	}

}
