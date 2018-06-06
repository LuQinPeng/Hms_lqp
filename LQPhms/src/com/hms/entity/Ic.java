package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Ic entity. @author MyEclipse Persistence Tools
 */

public class Ic implements java.io.Serializable {

	// Fields

	private Integer icid;
	private Patient patient;
	private String icbalance;
	private String icdate;
	private Set hospitals = new HashSet(0);
	private Set registrations = new HashSet(0);
	private Set icbills = new HashSet(0);
	private Set advices = new HashSet(0);
	private Set casehistories = new HashSet(0);
	private Set ictopups = new HashSet(0);
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ic() {
	}

	/** full constructor */
	public Ic(Patient patient, String icbalance, String icdate, Set hospitals, Set registrations, Set icbills,
			Set advices, Set casehistories, Set ictopups, Set patients) {
		this.patient = patient;
		this.icbalance = icbalance;
		this.icdate = icdate;
		this.hospitals = hospitals;
		this.registrations = registrations;
		this.icbills = icbills;
		this.advices = advices;
		this.casehistories = casehistories;
		this.ictopups = ictopups;
		this.patients = patients;
	}

	// Property accessors

	public Integer getIcid() {
		return this.icid;
	}

	public void setIcid(Integer icid) {
		this.icid = icid;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getIcbalance() {
		return this.icbalance;
	}

	public void setIcbalance(String icbalance) {
		this.icbalance = icbalance;
	}

	public String getIcdate() {
		return this.icdate;
	}

	public void setIcdate(String icdate) {
		this.icdate = icdate;
	}

	public Set getHospitals() {
		return this.hospitals;
	}

	public void setHospitals(Set hospitals) {
		this.hospitals = hospitals;
	}

	public Set getRegistrations() {
		return this.registrations;
	}

	public void setRegistrations(Set registrations) {
		this.registrations = registrations;
	}

	public Set getIcbills() {
		return this.icbills;
	}

	public void setIcbills(Set icbills) {
		this.icbills = icbills;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

	public Set getCasehistories() {
		return this.casehistories;
	}

	public void setCasehistories(Set casehistories) {
		this.casehistories = casehistories;
	}

	public Set getIctopups() {
		return this.ictopups;
	}

	public void setIctopups(Set ictopups) {
		this.ictopups = ictopups;
	}

	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}