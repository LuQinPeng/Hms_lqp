package com.hms.entity;

/**
 * PermissionMenu entity. @author MyEclipse Persistence Tools
 */

public class PermissionMenu implements java.io.Serializable {

	// Fields

	private Integer permissionMenuId;
	private Menu menu;
	private Permission permission;

	// Constructors

	/** default constructor */
	public PermissionMenu() {
	}

	/** full constructor */
	public PermissionMenu(Menu menu, Permission permission) {
		this.menu = menu;
		this.permission = permission;
	}

	// Property accessors

	public Integer getPermissionMenuId() {
		return this.permissionMenuId;
	}

	public void setPermissionMenuId(Integer permissionMenuId) {
		this.permissionMenuId = permissionMenuId;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}