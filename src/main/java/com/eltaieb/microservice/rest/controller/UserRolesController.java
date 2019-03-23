package com.eltaieb.microservice.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.roleservice.facade.RoleServiceFacade;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("user")
public class UserRolesController {
	
	private final RoleServiceFacade roleServiceFacade;
	public UserRolesController(RoleServiceFacade roleServiceFacade)
	{
		this.roleServiceFacade = roleServiceFacade;
	}
   
	 	
	

	 

	
	
	
	 
}