package com.eltaieb.microservice.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.base.model.ServiceResponse;
import com.eltaieb.microservice.base.model.SuccessServiceResponse;
import com.eltaieb.microservice.roleservice.facade.RoleServiceFacade;
import com.eltaieb.microservice.roleservice.model.Role;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("administration/system")
public class SystemUserRolesAdministration {
	
	private final RoleServiceFacade roleServiceFacade;
	public SystemUserRolesAdministration(RoleServiceFacade roleServiceFacade)
	{
		this.roleServiceFacade = roleServiceFacade;
	}
   
	 	

	@RequestMapping(path ="users/{userId}/{entityId}/" , method=RequestMethod.POST)
	public 	ServiceResponse<Object> addRolesToUser(@PathVariable("userId") Long userId,@PathVariable("entityId") Long entityId, @RequestBody List<String> roles) throws ServiceException
	{
			
		roleServiceFacade.addRolesToUser(userId,entityId,roles);
		return new SuccessServiceResponse<Object>(null);
	}
	
	 
	@RequestMapping(path ="entity-admin-roles" , method=RequestMethod.GET)
	public ServiceResponse<List<Role>> getRolesForEntityAdmin()
	{
		List<Role>roles= roleServiceFacade.getRolesForEntityAdmin();
		return new SuccessServiceResponse<List<Role>>(roles);
	}

	
	
	
	 
}