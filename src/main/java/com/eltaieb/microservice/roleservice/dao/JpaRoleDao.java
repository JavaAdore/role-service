package com.eltaieb.microservice.roleservice.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.eltaieb.microservice.roleservice.config.ServiceConstant;
import com.eltaieb.microservice.roleservice.entity.RoleEntity;

public interface JpaRoleDao extends CrudRepository<RoleEntity,Long>{

	@Query("select r from  Role r where code in :#{#codes}")
	List<RoleEntity> findRoleByCode(@Param("codes") String[] codes);

	@Query("select ur.role from  UserRole ur where ur.userId = :#{#userId}")
	List<RoleEntity> getUserRoles(@Param("userId") Long userId);
	
	
	default List<RoleEntity> getRolesForPublicUsers()
	{
		return findRoleByCode(ServiceConstant.PUBLIC_USER_DEFAULT_ROLES);
	}
	
 

}
