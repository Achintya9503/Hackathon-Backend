package com.wowza.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
	public Response(int code, String status) {
		this.code = code;
		this.status = status;
	}
	public String status;
	public int code;
}
