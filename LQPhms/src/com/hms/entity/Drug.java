package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Drug entity. @author MyEclipse Persistence Tools
 */

public class Drug implements java.io.Serializable {

	// Fields

	private Integer drugId;
	private Drugstoragerep drugstoragerep;
	private String drugName;
	private String drugSpell;
	private String drugUnit;
	private String drugSpec;
	private String drugDosage;
	private Float drugPrice;
	private Integer drugSpeci;
	private String state;
	private Date drugdate;
	private Set details = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drug() {
	}

	/** full constructor */
	public Drug(Drugstoragerep drugstoragerep, String drugName, String drugSpell, String drugUnit, String drugSpec,
			String drugDosage, Float drugPrice, Integer drugSpeci, String state, Date drugdate, Set details) {
		this.drugstoragerep = drugstoragerep;
		this.drugName = drugName;
		this.drugSpell = drugSpell;
		this.drugUnit = drugUnit;
		this.drugSpec = drugSpec;
		this.drugDosage = drugDosage;
		this.drugPrice = drugPrice;
		this.drugSpeci = drugSpeci;
		this.state = state;
		this.drugdate = drugdate;
		this.details = details;
	}

	// Property accessors

	public Integer getDrugId() {
		return this.drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public Drugstoragerep getDrugstoragerep() {
		return this.drugstoragerep;
	}

	public void setDrugstoragerep(Drugstoragerep drugstoragerep) {
		this.drugstoragerep = drugstoragerep;
	}

	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugSpell() {
		return this.drugSpell;
	}

	public void setDrugSpell(String drugSpell) {
		this.drugSpell = drugSpell;
	}

	public String getDrugUnit() {
		return this.drugUnit;
	}

	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}

	public String getDrugSpec() {
		return this.drugSpec;
	}

	public void setDrugSpec(String drugSpec) {
		this.drugSpec = drugSpec;
	}

	public String getDrugDosage() {
		return this.drugDosage;
	}

	public void setDrugDosage(String drugDosage) {
		this.drugDosage = drugDosage;
	}

	public Float getDrugPrice() {
		return this.drugPrice;
	}

	public void setDrugPrice(Float drugPrice) {
		this.drugPrice = drugPrice;
	}

	public Integer getDrugSpeci() {
		return this.drugSpeci;
	}

	public void setDrugSpeci(Integer drugSpeci) {
		this.drugSpeci = drugSpeci;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDrugdate() {
		return this.drugdate;
	}

	public void setDrugdate(Date drugdate) {
		this.drugdate = drugdate;
	}

	public Set getDetails() {
		return this.details;
	}

	public void setDetails(Set details) {
		this.details = details;
	}

}