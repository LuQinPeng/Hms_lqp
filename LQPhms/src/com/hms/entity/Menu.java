package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private String menuName;
	private String menuType;
	private Integer menuFather;
	private String menuPath;
	private Set permissionMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** full constructor */
	public Menu(String menuName, String menuType, Integer menuFather, String menuPath, Set permissionMenus) {
		this.menuName = menuName;
		this.menuType = menuType;
		this.menuFather = menuFather;
		this.menuPath = menuPath;
		this.permissionMenus = permissionMenus;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public Integer getMenuFather() {
		return this.menuFather;
	}

	public void setMenuFather(Integer menuFather) {
		this.menuFather = menuFather;
	}

	public String getMenuPath() {
		return this.menuPath;
	}

	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
	}

	public Set getPermissionMenus() {
		return this.permissionMenus;
	}

	public void setPermissionMenus(Set permissionMenus) {
		this.permissionMenus = permissionMenus;
	}

}