package com.hms.entity;

/**
 * UserPermission entity. @author MyEclipse Persistence Tools
 */

public class UserPermission implements java.io.Serializable {

	// Fields

	private Integer permissionGroupId;
	private User user;
	private Permission permission;

	// Constructors

	/** default constructor */
	public UserPermission() {
	}

	/** full constructor */
	public UserPermission(User user, Permission permission) {
		this.user = user;
		this.permission = permission;
	}

	// Property accessors

	public Integer getPermissionGroupId() {
		return this.permissionGroupId;
	}

	public void setPermissionGroupId(Integer permissionGroupId) {
		this.permissionGroupId = permissionGroupId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}