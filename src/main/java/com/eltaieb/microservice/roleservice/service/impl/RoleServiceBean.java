package com.eltaieb.microservice.roleservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.roleservice.config.ServiceConstant;
import com.eltaieb.microservice.roleservice.dao.JpaRoleDao;
import com.eltaieb.microservice.roleservice.dao.JpaUserRoleDao;
import com.eltaieb.microservice.roleservice.entity.RoleEntity;
import com.eltaieb.microservice.roleservice.entity.UserRoleEntity;
import com.eltaieb.microservice.roleservice.model.Role;
import com.eltaieb.microservice.roleservice.service.api.RoleService;

import lombok.extern.java.Log;

@Log
@Service
public class RoleServiceBean implements RoleService {

	private JpaRoleDao jpaRoleDao;
	private JpaUserRoleDao jpaUserRoleDao;

	public RoleServiceBean(JpaRoleDao jpaRoleDao, JpaUserRoleDao jpaUserRoleDao) {
		this.jpaRoleDao = jpaRoleDao;
		this.jpaUserRoleDao = jpaUserRoleDao;
	}

	@Override
	public List<Role> AddPublicUserRolesToUser(Long userId) {
		List<RoleEntity> roles = jpaRoleDao.getRolesForPublicUsers();
		return roles.stream().map(r -> {
			jpaUserRoleDao.save(new UserRoleEntity(userId, r));
			return new Role(r.getCode());
		}).collect(Collectors.toList());
	}

	@Override
	public List<Role> getUserRoles(Long userId) {
		List<RoleEntity> roles = jpaRoleDao.getUserRoles(userId);
		return roles.stream().map(r -> new Role(r.getCode())).collect(Collectors.toList());

	}

	@Override
	public List<Role> getRolesForPublicUsers() {
		List<RoleEntity> roles = jpaRoleDao.getRolesForPublicUsers();
		return roles.stream().map(r -> new Role(r.getCode())).collect(Collectors.toList());
	}

	@Override
	public void addRolesToUser(Long userId, Long entityId, List<String> roles) {
		
		List<RoleEntity> rolesEntities=	jpaRoleDao.findRoleByCode( roles.toArray(new String[roles.size()]));
		rolesEntities.forEach(r->
		{
			UserRoleEntity userRoleEntity = new UserRoleEntity();
			userRoleEntity.setRole(r);
			userRoleEntity.setEntityId(entityId);
			userRoleEntity.setUserId(userId);
			jpaUserRoleDao.save(userRoleEntity);
			
		});
		
		
		
	}

	@Override
	public List<Role> getRolesForEntityAdmin() {
		return jpaRoleDao.findRoleByCode(ServiceConstant.ENTITY_ADMIN_BASIC_ROLES).stream().map(r -> new Role(r.getCode())).collect(Collectors.toList());
	}

}
