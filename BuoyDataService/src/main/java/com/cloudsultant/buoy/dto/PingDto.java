package com.cloudsultant.buoy.dto;

public class PingDto {
	
	private String message;

	public PingDto() {
		super();
	}
	public PingDto(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "PingDto [message=" + message + "]";
	}

}
