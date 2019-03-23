package com.eltaieb.microservice.roleservice.service.api;

import java.util.List;

import com.eltaieb.microservice.roleservice.model.Role;

public interface RoleService {

	List<Role> AddPublicUserRolesToUser(Long userId);

	List<Role> getUserRoles(Long userId);

	List<Role> getRolesForPublicUsers();

	void addRolesToUser(Long userId, Long entityId, List<String> roles);

	List<Role> getRolesForEntityAdmin();

 

	 
	
	
}
