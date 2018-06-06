package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer depaId;
	private String depaName;
	private String depaComment;
	private Set buildings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String depaName, String depaComment, Set buildings) {
		this.depaName = depaName;
		this.depaComment = depaComment;
		this.buildings = buildings;
	}

	// Property accessors

	public Integer getDepaId() {
		return this.depaId;
	}

	public void setDepaId(Integer depaId) {
		this.depaId = depaId;
	}

	public String getDepaName() {
		return this.depaName;
	}

	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}

	public String getDepaComment() {
		return this.depaComment;
	}

	public void setDepaComment(String depaComment) {
		this.depaComment = depaComment;
	}

	public Set getBuildings() {
		return this.buildings;
	}

	public void setBuildings(Set buildings) {
		this.buildings = buildings;
	}

}