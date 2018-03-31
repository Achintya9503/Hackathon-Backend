package com.wowza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="friends_mapping")
@Data
@AllArgsConstructor
public class Friends_mapping {

	@Id
	private long s_no;
	@Column(nullable=false)
	private long user_id;
	@Column(nullable=false)
	private long user_id_1;
	@Column(nullable=false)
	private boolean is_pending;

	public Friends_mapping() {
		
	}
	
	
}


