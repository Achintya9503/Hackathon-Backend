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
	private long video_id;
	@Column(nullable=false)
	private String video_name;
	@Column(nullable=false)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp video_start_time;
	@Column(nullable=true)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp video_end_time;
	@Column(nullable=false)
	private boolean available;
	@Column(nullable=false)
	private boolean live;
	@Column(nullable=true)
	private long video_reference_id;
	public Video() {
		
	}
	

}
