package com.wowza.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="friends_mapping")
@Data
@AllArgsConstructor
public class Friends_mapping {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long s_no;
	@Column(nullable=false, name="user_id")
	private long userId;
	@Column(nullable=false, name="friend_id")
	private long friendId;
	@Column(nullable=false)
	private boolean pending;

	public Friends_mapping() {
		
	}
	
	
}


