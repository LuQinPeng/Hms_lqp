package com.hms.entity;

/**
 * RoleUser entity. @author MyEclipse Persistence Tools
 */

public class RoleUser implements java.io.Serializable {

	// Fields

	private Integer roleUserId;
	private Employee employee;
	private User user;

	// Constructors

	/** default constructor */
	public RoleUser() {
	}

	/** full constructor */
	public RoleUser(Employee employee, User user) {
		this.employee = employee;
		this.user = user;
	}

	// Property accessors

	public Integer getRoleUserId() {
		return this.roleUserId;
	}

	public void setRoleUserId(Integer roleUserId) {
		this.roleUserId = roleUserId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}