package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Inhospital entity. @author MyEclipse Persistence Tools
 */

public class Inhospital implements java.io.Serializable {

	// Fields

	private Integer inHospitalId;
	private Integer clinicSpeci;
	private Set dailydetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Inhospital() {
	}

	/** full constructor */
	public Inhospital(Integer clinicSpeci, Set dailydetails) {
		this.clinicSpeci = clinicSpeci;
		this.dailydetails = dailydetails;
	}

	// Property accessors

	public Integer getInHospitalId() {
		return this.inHospitalId;
	}

	public void setInHospitalId(Integer inHospitalId) {
		this.inHospitalId = inHospitalId;
	}

	public Integer getClinicSpeci() {
		return this.clinicSpeci;
	}

	public void setClinicSpeci(Integer clinicSpeci) {
		this.clinicSpeci = clinicSpeci;
	}

	public Set getDailydetails() {
		return this.dailydetails;
	}

	public void setDailydetails(Set dailydetails) {
		this.dailydetails = dailydetails;
	}

}