package com.eltaieb.microservice.roleservice.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="Role")
@Table(name="ROLE")
public class RoleEntity implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="role_pk_seq")
	@SequenceGenerator(name="role_pk_seq" , sequenceName="role_pk_seq",allocationSize=1)
	private Long id;
	
	private String code;
	
	public RoleEntity(Long id, String code) {
		super();
		this.id = id;
		this.code = code;
	}

    
	
	 
 
}
