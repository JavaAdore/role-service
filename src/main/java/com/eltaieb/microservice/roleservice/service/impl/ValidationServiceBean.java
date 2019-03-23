package com.eltaieb.microservice.roleservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eltaieb.microservice.base.exception.ServiceException;
import com.eltaieb.microservice.roleservice.service.api.ValidationService;

@Service
public class ValidationServiceBean implements ValidationService {

	@Override
	public void validateAddRolesToUser(Long userId, Long entityId, List<String> roles) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	 

	 
}
