package com.eltaieb.microservice.roleservice.dao;
import org.springframework.data.repository.CrudRepository;

import com.eltaieb.microservice.roleservice.entity.UserRoleEntity;

public interface JpaUserRoleDao extends CrudRepository<UserRoleEntity,Long>{

	 
	 
}
