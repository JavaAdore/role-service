package com.eltaieb.microservice.roleservice.facade;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.roleservice.model.Role;
import com.eltaieb.microservice.roleservice.service.api.RoleService;
import com.eltaieb.microservice.roleservice.service.api.ValidationService;
  
@Service()
public class RoleServiceFacadeBean implements RoleServiceFacade {

  	private ValidationService validationService;
	private RoleService roleService;
 
	public RoleServiceFacadeBean(RoleService userSerice,ValidationService validationService) {
			 
		super();
		this.roleService = userSerice;
  		this.validationService = validationService;

 	}

	@Override
	public List<Role> AddPublicUserRolesToUser(Long userId) {
		 
		return roleService.AddPublicUserRolesToUser(userId);
	}

	@Override
	public List<Role> getUserRoles(Long userId) {
		return roleService.getUserRoles(userId);
	}

	@Override
	public List<Role> getRolesForPublicUsers() {
 		return roleService.getRolesForPublicUsers();
	}

	@Override
	public void addRolesToUser(Long userId, Long entityId, List<String> roles) throws ServiceException {
		validationService.validateAddRolesToUser(userId,entityId,roles);
		roleService.addRolesToUser( userId,  entityId, roles);
	}

	@Override
	public List<Role> getRolesForEntityAdmin() {
		return roleService.getRolesForEntityAdmin();
	}

	 

	 

	 

}
