package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Drugstoragerep entity. @author MyEclipse Persistence Tools
 */

public class Drugstoragerep implements java.io.Serializable {

	// Fields

	private Integer dsrId;
	private Prescriptionsubsidiary prescriptionsubsidiary;
	private Drugstorage drugstorage;
	private Integer dsrSumNumber;
	private Set unloadings = new HashSet(0);
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drugstoragerep() {
	}

	/** full constructor */
	public Drugstoragerep(Prescriptionsubsidiary prescriptionsubsidiary, Drugstorage drugstorage, Integer dsrSumNumber,
			Set unloadings, Set drugs) {
		this.prescriptionsubsidiary = prescriptionsubsidiary;
		this.drugstorage = drugstorage;
		this.dsrSumNumber = dsrSumNumber;
		this.unloadings = unloadings;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getDsrId() {
		return this.dsrId;
	}

	public void setDsrId(Integer dsrId) {
		this.dsrId = dsrId;
	}

	public Prescriptionsubsidiary getPrescriptionsubsidiary() {
		return this.prescriptionsubsidiary;
	}

	public void setPrescriptionsubsidiary(Prescriptionsubsidiary prescriptionsubsidiary) {
		this.prescriptionsubsidiary = prescriptionsubsidiary;
	}

	public Drugstorage getDrugstorage() {
		return this.drugstorage;
	}

	public void setDrugstorage(Drugstorage drugstorage) {
		this.drugstorage = drugstorage;
	}

	public Integer getDsrSumNumber() {
		return this.dsrSumNumber;
	}

	public void setDsrSumNumber(Integer dsrSumNumber) {
		this.dsrSumNumber = dsrSumNumber;
	}

	public Set getUnloadings() {
		return this.unloadings;
	}

	public void setUnloadings(Set unloadings) {
		this.unloadings = unloadings;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}