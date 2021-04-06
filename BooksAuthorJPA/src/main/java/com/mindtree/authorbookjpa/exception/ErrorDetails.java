package com.mindtree.authorbookjpa.exception;

import java.util.Date;

public class ErrorDetails {

	private Date timeStamp;
	private String message;
	private String description;

	public ErrorDetails() {
	}

	public ErrorDetails(Date timeStamp, String message, String description) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.description = description;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return description;
	}

	public void setDetails(String description) {
		this.description = description;
	}

}
