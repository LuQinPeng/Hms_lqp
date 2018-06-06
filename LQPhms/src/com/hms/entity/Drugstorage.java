package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Drugstorage entity. @author MyEclipse Persistence Tools
 */

public class Drugstorage implements java.io.Serializable {

	// Fields

	private Integer drugStorageId;
	private String drugStorageType;
	private Set purchases = new HashSet(0);
	private Set drugstoragereps = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drugstorage() {
	}

	/** full constructor */
	public Drugstorage(String drugStorageType, Set purchases, Set drugstoragereps) {
		this.drugStorageType = drugStorageType;
		this.purchases = purchases;
		this.drugstoragereps = drugstoragereps;
	}

	// Property accessors

	public Integer getDrugStorageId() {
		return this.drugStorageId;
	}

	public void setDrugStorageId(Integer drugStorageId) {
		this.drugStorageId = drugStorageId;
	}

	public String getDrugStorageType() {
		return this.drugStorageType;
	}

	public void setDrugStorageType(String drugStorageType) {
		this.drugStorageType = drugStorageType;
	}

	public Set getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set purchases) {
		this.purchases = purchases;
	}

	public Set getDrugstoragereps() {
		return this.drugstoragereps;
	}

	public void setDrugstoragereps(Set drugstoragereps) {
		this.drugstoragereps = drugstoragereps;
	}

}