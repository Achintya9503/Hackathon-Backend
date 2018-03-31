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
