package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Floor entity. @author MyEclipse Persistence Tools
 */

public class Floor implements java.io.Serializable {

	// Fields

	private Integer floorId;
	private Building building;
	private String floorName;
	private String floorComment;
	private Set offices = new HashSet(0);

	// Constructors

	/** default constructor */
	public Floor() {
	}

	/** full constructor */
	public Floor(Building building, String floorName, String floorComment, Set offices) {
		this.building = building;
		this.floorName = floorName;
		this.floorComment = floorComment;
		this.offices = offices;
	}

	// Property accessors

	public Integer getFloorId() {
		return this.floorId;
	}

	public void setFloorId(Integer floorId) {
		this.floorId = floorId;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public String getFloorName() {
		return this.floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	public String getFloorComment() {
		return this.floorComment;
	}

	public void setFloorComment(String floorComment) {
		this.floorComment = floorComment;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

}