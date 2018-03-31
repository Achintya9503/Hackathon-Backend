package com.wowza.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Video {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long video_id;
	@Column(nullable=false)
	private String video_name;
	@Column(nullable=false)
	private Timestamp video_start_time;
	@Column(nullable=true)
	private Timestamp video_end_time;
	@Column(nullable=false)
	private boolean is_available;
	@Column(nullable=false)
	private boolean is_live;
	@Column(nullable=true)
	private long video_reference_id;
	public Video() {
		
	}
	

}
