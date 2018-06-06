package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */

public class Patient implements java.io.Serializable {

	// Fields

	private Integer patientId;
	private Ic ic;
	private String patientName;
	private String patientSex;
	private Integer patientPhone;
	private String patientCard;
	private String patientAddress;
	private Set ics = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** full constructor */
	public Patient(Ic ic, String patientName, String patientSex, Integer patientPhone, String patientCard,
			String patientAddress, Set ics) {
		this.ic = ic;
		this.patientName = patientName;
		this.patientSex = patientSex;
		this.patientPhone = patientPhone;
		this.patientCard = patientCard;
		this.patientAddress = patientAddress;
		this.ics = ics;
	}

	// Property accessors

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Ic getIc() {
		return this.ic;
	}

	public void setIc(Ic ic) {
		this.ic = ic;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return this.patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Integer getPatientPhone() {
		return this.patientPhone;
	}

	public void setPatientPhone(Integer patientPhone) {
		this.patientPhone = patientPhone;
	}

	public String getPatientCard() {
		return this.patientCard;
	}

	public void setPatientCard(String patientCard) {
		this.patientCard = patientCard;
	}

	public String getPatientAddress() {
		return this.patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public Set getIcs() {
		return this.ics;
	}

	public void setIcs(Set ics) {
		this.ics = ics;
	}

}