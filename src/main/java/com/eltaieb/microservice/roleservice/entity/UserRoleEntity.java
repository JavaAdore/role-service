package com.eltaieb.microservice.roleservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="UserRole")
@Table(name="USER_ROLE")
public class UserRoleEntity implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_role_pk_seq")
	@SequenceGenerator(name="user_role_pk_seq" , sequenceName="user_role_pk_seq",allocationSize=1)
	private Long id;
	 
	@Column(name="user_id")
	private Long userId;
	
	
	@Column(name="entity_id")
	private Long entityId;
	
	
	@ManyToOne
	@JoinColumn(name="role_id", referencedColumnName="id")
	private RoleEntity role;
    
	
	public UserRoleEntity(Long userId, RoleEntity role) {
		super();
		this.userId = userId;
		this.role = role;
	}
	
	 
 
}
