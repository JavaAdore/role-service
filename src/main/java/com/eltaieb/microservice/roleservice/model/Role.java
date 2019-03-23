package com.eltaieb.microservice.roleservice.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Role implements Serializable{

	 	public Role(String code) {
		super();
		this.code = code;
	}

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private String code;
}
