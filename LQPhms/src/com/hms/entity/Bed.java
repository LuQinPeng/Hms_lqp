package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bed entity. @author MyEclipse Persistence Tools
 */

public class Bed implements java.io.Serializable {

	// Fields

	private Integer bedId;
	private Hospital hospital;
	private Room room;
	private String bedState;
	private Integer bedPrice;
	private Set hospitals = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bed() {
	}

	/** full constructor */
	public Bed(Hospital hospital, Room room, String bedState, Integer bedPrice, Set hospitals) {
		this.hospital = hospital;
		this.room = room;
		this.bedState = bedState;
		this.bedPrice = bedPrice;
		this.hospitals = hospitals;
	}

	// Property accessors

	public Integer getBedId() {
		return this.bedId;
	}

	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getBedState() {
		return this.bedState;
	}

	public void setBedState(String bedState) {
		this.bedState = bedState;
	}

	public Integer getBedPrice() {
		return this.bedPrice;
	}

	public void setBedPrice(Integer bedPrice) {
		this.bedPrice = bedPrice;
	}

	public Set getHospitals() {
		return this.hospitals;
	}

	public void setHospitals(Set hospitals) {
		this.hospitals = hospitals;
	}

}