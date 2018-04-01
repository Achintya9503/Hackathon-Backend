package com.wowza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private long userId;
	@Column(unique=true, nullable=true)
	private String username;
	@Column(unique=true, nullable=false)
	private String email;
	@Column(nullable=true)
	private String password;
	@Column(nullable=false, name="full_name")
	private String fullName;
	@Column(unique=true, nullable=true, name="device_access_token")
	private String deviceAccessToken;
	@Column(unique=true, nullable=true, name="mobile_no")
	private String mobileNo;
	
	public User() {
		
	}

}
