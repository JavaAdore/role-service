package com.eltaieb.microservice.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eltaieb.microservice.base.model.ServiceResponse;
import com.eltaieb.microservice.base.model.SuccessServiceResponse;
import com.eltaieb.microservice.roleservice.facade.RoleServiceFacade;
import com.eltaieb.microservice.roleservice.model.Role;

import lombok.extern.java.Log;

@Log
@RestController
@RequestMapping("administration/public")
public class RolesAdministration {
	
	private final RoleServiceFacade roleServiceFacade;
	public RolesAdministration(RoleServiceFacade roleServiceFacade)
	{
		this.roleServiceFacade = roleServiceFacade;
	}
   
	 	
	@RequestMapping(path ="addPublicUserRoles/{userId}" , method=RequestMethod.GET)
	public ServiceResponse<List<Role>> AddPublicUserRolesToUser(@PathVariable("userId") Long userId)
	{
		List<Role>roles= roleServiceFacade.AddPublicUserRolesToUser(userId);
		return new SuccessServiceResponse<List<Role>>(roles);
    }

	@RequestMapping(path ="{userId}" , method=RequestMethod.GET)
	public ServiceResponse<List<Role>> getUserRoles(@PathVariable("userId") Long userId)
	{
		List<Role>roles= roleServiceFacade.getUserRoles(userId);
		return new SuccessServiceResponse<List<Role>>(roles);
	}
 
	
	@RequestMapping(path ="roles" , method=RequestMethod.GET)
	public ServiceResponse<List<Role>> getRolesForPublicUsers()
	{
		List<Role>roles= roleServiceFacade.getRolesForPublicUsers();
		return new SuccessServiceResponse<List<Role>>(roles);
	}


	 

	
	
	
	 
}