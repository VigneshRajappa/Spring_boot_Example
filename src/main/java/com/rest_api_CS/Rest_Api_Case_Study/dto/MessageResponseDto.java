package com.rest_api_CS.Rest_Api_Case_Study.dto;

import org.springframework.stereotype.Component;

@Component
public class MessageResponseDto {
	private String body;
	private int Statuscode;
	
	
	public MessageResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MessageResponseDto(String body, int statuscode) {
		super();
		this.body = body;
		Statuscode = statuscode;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getStatuscode() {
		return Statuscode;
	}
	public void setStatuscode(int statuscode) {
		Statuscode = statuscode;
	}
	
	
}
