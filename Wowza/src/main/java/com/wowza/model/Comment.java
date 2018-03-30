package com.wowza.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Comment {
	
	@Id
	private long comment_id;
	@Column(nullable=false)
	private long user_id;
	@Column(nullable=false)
	private long video_id;
	@Column(nullable=false)
	private long comment_number;
	@Column(nullable=false)
	private String comment;
	@Column(nullable=false)
	private Timestamp comment_time;
	
	public Comment() {
		
	}

}
