package com.wowza.model;

import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="comment")
@Data
@AllArgsConstructor
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp comment_time;
	
	public Comment() {
		
	}

}
