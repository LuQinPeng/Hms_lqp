package com.hms.entity;

import java.util.Date;

/**
 * LoginLogout entity. @author MyEclipse Persistence Tools
 */

public class LoginLogout implements java.io.Serializable {

	// Fields

	private Integer logId;
	private Employee employee;
	private Date login;
	private Date logout;

	// Constructors

	/** default constructor */
	public LoginLogout() {
	}

	/** full constructor */
	public LoginLogout(Employee employee, Date login, Date logout) {
		this.employee = employee;
		this.login = login;
		this.logout = logout;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getLogin() {
		return this.login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}

	public Date getLogout() {
		return this.logout;
	}

	public void setLogout(Date logout) {
		this.logout = logout;
	}

}