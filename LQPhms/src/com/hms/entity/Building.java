package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Building entity. @author MyEclipse Persistence Tools
 */

public class Building implements java.io.Serializable {

	// Fields

	private Integer builId;
	private Department department;
	private String builName;
	private String builComment;
	private Set floors = new HashSet(0);

	// Constructors

	/** default constructor */
	public Building() {
	}

	/** full constructor */
	public Building(Department department, String builName, String builComment, Set floors) {
		this.department = department;
		this.builName = builName;
		this.builComment = builComment;
		this.floors = floors;
	}

	// Property accessors

	public Integer getBuilId() {
		return this.builId;
	}

	public void setBuilId(Integer builId) {
		this.builId = builId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getBuilName() {
		return this.builName;
	}

	public void setBuilName(String builName) {
		this.builName = builName;
	}

	public String getBuilComment() {
		return this.builComment;
	}

	public void setBuilComment(String builComment) {
		this.builComment = builComment;
	}

	public Set getFloors() {
		return this.floors;
	}

	public void setFloors(Set floors) {
		this.floors = floors;
	}

}