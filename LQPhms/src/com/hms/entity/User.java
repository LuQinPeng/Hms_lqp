package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private Set userPermissions = new HashSet(0);
	private Set roleUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userName, Set userPermissions, Set roleUsers) {
		this.userName = userName;
		this.userPermissions = userPermissions;
		this.roleUsers = roleUsers;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(Set userPermissions) {
		this.userPermissions = userPermissions;
	}

	public Set getRoleUsers() {
		return this.roleUsers;
	}

	public void setRoleUsers(Set roleUsers) {
		this.roleUsers = roleUsers;
	}

}