package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Sickcheck entity. @author MyEclipse Persistence Tools
 */

public class Sickcheck implements java.io.Serializable {

	// Fields

	private Integer sickId;
	private Employee employee;
	private Checklist checklist;
	private String sickName;
	private Set checkses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Sickcheck() {
	}

	/** full constructor */
	public Sickcheck(Employee employee, Checklist checklist, String sickName, Set checkses) {
		this.employee = employee;
		this.checklist = checklist;
		this.sickName = sickName;
		this.checkses = checkses;
	}

	// Property accessors

	public Integer getSickId() {
		return this.sickId;
	}

	public void setSickId(Integer sickId) {
		this.sickId = sickId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Checklist getChecklist() {
		return this.checklist;
	}

	public void setChecklist(Checklist checklist) {
		this.checklist = checklist;
	}

	public String getSickName() {
		return this.sickName;
	}

	public void setSickName(String sickName) {
		this.sickName = sickName;
	}

	public Set getCheckses() {
		return this.checkses;
	}

	public void setCheckses(Set checkses) {
		this.checkses = checkses;
	}

}