package com.eltaieb.microservice.roleservice.config;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Getter
@Service
public class ServiceConstant {

 
	
 

	public static final String[] PUBLIC_USER_DEFAULT_ROLES = new String[] {"USER"};
	public static final String[] ENTITY_ADMIN_BASIC_ROLES = new String[] {"USER"};

 
 
}
