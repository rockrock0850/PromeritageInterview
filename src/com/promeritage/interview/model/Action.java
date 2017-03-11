package com.promeritage.interview.model;

public enum Action {

	TURN_LEFT("left"),
	TURN_RIGHT("right"),
	SHOOT("shoot");
	
	private String code;
	private String message;
	
	private Action(String message) {
		this.message = message;
	}
	
	private Action(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/*
	 * setter getter
	 */
	
	public String getMessage() {
		return message;
	}

	public String getCode() {
		return code;
	}
}
