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
@Table(name="User")
@Data
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long user_id;
	@Column(unique=true, nullable=false)
	private String username;
	@Column(unique=true, nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	@Column(unique=true)
	private String device_access_token;
	@Column(unique=true)
	private String mobile;
	
	public User() {
		
	}

}
