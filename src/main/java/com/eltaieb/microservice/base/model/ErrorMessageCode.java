package com.eltaieb.microservice.base.model;

public enum ErrorMessageCode {
	
	OPERATION_COMPLETED_SUCCESSFULLY("00","OPERATION_DONE_SUCCESSFULLY"),
	PUBLIC_USER_USER_NAME_IS_REQIORED("03","PUBLIC_USER_USER_NAME_IS_REQIORED"),
	PUBLIC_USER_FIRST_NAME_IS_REQIORED("19","PUBLIC_USER_FIRST_NAME_IS_REQIORED"), 
	PUBLIC_USER_BIRTHDAY_COULD_NOT_BE_IN_THE_FUTURE("06","PUBLIC_USER_BIRTHDAY_COULD_NOT_BE_IN_THE_FUTURE"),
	PUBLIC_USER_AGE_IS_NOT_ALLOWED("07","PUBLIC_USER_AGE_IS_NOT_ALLOWED"), 
	PUBLIC_USER_BIRTHDAY_IS_REQIORED("08","PUBLIC_USER_BIRTHDAY_IS_REQIORED"),
	USER_NAME_NOT_FOUND("09","USER_NAME_NOT_FOUND"), 
	INVALID_USER_NAME_OR_PASSWORD("10","INVALID_USER_NAME_OR_PASSWORD"), 
	GENERAL_BACKEND_ERROR("15","GENERAL_BACKEND_ERROR"),
;	
	
	private String code;
	private String messageKey;
	
	

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	ErrorMessageCode()
	{
		
	}
	
	ErrorMessageCode(String code)
	{
		this.code= code;
	}
	
	ErrorMessageCode(String code,String messageKey)
	{
		this.code= code;
		this.messageKey = messageKey;
	}
	
	public String getCode() {
		return code;
	}
	
}
