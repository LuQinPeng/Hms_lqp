package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Regdetails entity. @author MyEclipse Persistence Tools
 */

public class Regdetails implements java.io.Serializable {

	// Fields

	private Integer tailsId;
	private Registration registration;
	private String tailsOffice;
	private String tailsType;
	private String tailsDoctor;
	private Set registrations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Regdetails() {
	}

	/** full constructor */
	public Regdetails(Registration registration, String tailsOffice, String tailsType, String tailsDoctor,
			Set registrations) {
		this.registration = registration;
		this.tailsOffice = tailsOffice;
		this.tailsType = tailsType;
		this.tailsDoctor = tailsDoctor;
		this.registrations = registrations;
	}

	// Property accessors

	public Integer getTailsId() {
		return this.tailsId;
	}

	public void setTailsId(Integer tailsId) {
		this.tailsId = tailsId;
	}

	public Registration getRegistration() {
		return this.registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public String getTailsOffice() {
		return this.tailsOffice;
	}

	public void setTailsOffice(String tailsOffice) {
		this.tailsOffice = tailsOffice;
	}

	public String getTailsType() {
		return this.tailsType;
	}

	public void setTailsType(String tailsType) {
		this.tailsType = tailsType;
	}

	public String getTailsDoctor() {
		return this.tailsDoctor;
	}

	public void setTailsDoctor(String tailsDoctor) {
		this.tailsDoctor = tailsDoctor;
	}

	public Set getRegistrations() {
		return this.registrations;
	}

	public void setRegistrations(Set registrations) {
		this.registrations = registrations;
	}

}