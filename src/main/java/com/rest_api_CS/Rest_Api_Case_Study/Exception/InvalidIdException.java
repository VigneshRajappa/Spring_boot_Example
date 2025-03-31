package com.rest_api_CS.Rest_Api_Case_Study.Exception;

public class InvalidIdException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	public InvalidIdException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
