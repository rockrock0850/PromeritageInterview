package com.promeritage.interview.utils;

public enum FontConstant {

	Plain("Plain"),
	Bold("Bold"),
	Italic("Italic");
	
	private String code;
	private String message;
	
	private FontConstant(String message) {
		this.message = message;
	}
	
	private FontConstant(String code, String message) {
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
