package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Office entity. @author MyEclipse Persistence Tools
 */

public class Office implements java.io.Serializable {

	// Fields

	private Integer officeId;
	private Floor floor;
	private String officeName;
	private String officeComment;
	private Set employees = new HashSet(0);
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Office() {
	}

	/** full constructor */
	public Office(Floor floor, String officeName, String officeComment, Set employees, Set rooms) {
		this.floor = floor;
		this.officeName = officeName;
		this.officeComment = officeComment;
		this.employees = employees;
		this.rooms = rooms;
	}

	// Property accessors

	public Integer getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}

	public Floor getFloor() {
		return this.floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public String getOfficeName() {
		return this.officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeComment() {
		return this.officeComment;
	}

	public void setOfficeComment(String officeComment) {
		this.officeComment = officeComment;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}