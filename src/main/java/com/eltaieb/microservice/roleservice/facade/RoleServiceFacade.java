package com.eltaieb.microservice.roleservice.facade;

import java.util.List;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.roleservice.model.Role;


public interface RoleServiceFacade {

	List<Role> AddPublicUserRolesToUser(Long userId);

	List<Role> getUserRoles(Long userId);

	List<Role> getRolesForPublicUsers();

	void addRolesToUser(Long userId, Long entityId, List<String> roles) throws ServiceException;

	List<Role> getRolesForEntityAdmin();


 
 
	 
}
