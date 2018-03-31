package com.wowza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Friends_mapping {
	
	@Id
	private long user_id;
	@Column(nullable=false)
	private long user_id_1;
	
	public Friends_mapping() {
		
	}
	
	
}


