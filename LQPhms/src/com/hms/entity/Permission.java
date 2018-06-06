package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Permission entity. @author MyEclipse Persistence Tools
 */

public class Permission implements java.io.Serializable {

	// Fields

	private Integer permiId;
	private String permiName;
	private String permiPath;
	private Set userPermissions = new HashSet(0);
	private Set permissionMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Permission() {
	}

	/** full constructor */
	public Permission(String permiName, String permiPath, Set userPermissions, Set permissionMenus) {
		this.permiName = permiName;
		this.permiPath = permiPath;
		this.userPermissions = userPermissions;
		this.permissionMenus = permissionMenus;
	}

	// Property accessors

	public Integer getPermiId() {
		return this.permiId;
	}

	public void setPermiId(Integer permiId) {
		this.permiId = permiId;
	}

	public String getPermiName() {
		return this.permiName;
	}

	public void setPermiName(String permiName) {
		this.permiName = permiName;
	}

	public String getPermiPath() {
		return this.permiPath;
	}

	public void setPermiPath(String permiPath) {
		this.permiPath = permiPath;
	}

	public Set getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(Set userPermissions) {
		this.userPermissions = userPermissions;
	}

	public Set getPermissionMenus() {
		return this.permissionMenus;
	}

	public void setPermissionMenus(Set permissionMenus) {
		this.permissionMenus = permissionMenus;
	}

}