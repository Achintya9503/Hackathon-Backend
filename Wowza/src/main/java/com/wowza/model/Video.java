package com.wowza.model;

import java.sql.Timestamp;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "video")
@Data
@AllArgsConstructor
public class Video {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, name="video_id")
	private long videoId;
	@Column(nullable=false, name="video_name")
	private String videoName;
	@Column(nullable=false, name="video_start_time")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp videoStartTime;
	@Column(nullable=true, name="video_end_time")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp videoEndTime;
	@Column(nullable=false)
	private boolean available;
	@Column(nullable=false)
	private boolean live;
	@Column(nullable=true, name="video_reference_id")
	private long videoReferenceId;
	public Video() {
		
	}
	

}
