package com.eltaieb.microservice.roleservice.service.api;

import java.util.List;

import com.eltaieb.microservice.base.exception.ServiceException;

public interface ValidationService {

	void validateAddRolesToUser(Long userId, Long entityId, List<String> roles) throws ServiceException;

 
	 
}
