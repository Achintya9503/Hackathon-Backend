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
	@Column(nullable=false ,name="comment_id")
	private long commentId;
	@Column(nullable=false, name="user_id")
	private long userId;
	@Column(nullable=false, name="video_id")
	private long videoId;
	@Column(nullable=false, name="comment_number")
	private long commentNumber;
	@Column(nullable=false)
	private String comment;
	@Column(nullable=false, name="comment_time")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp commentTime;
	
	public Comment() {
		
	}

}
