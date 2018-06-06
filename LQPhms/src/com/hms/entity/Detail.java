package com.hms.entity;

/**
 * Detail entity. @author MyEclipse Persistence Tools
 */

public class Detail implements java.io.Serializable {

	// Fields

	private Integer detId;
	private Unloading unloading;
	private Drug drug;
	private Integer detnumb;

	// Constructors

	/** default constructor */
	public Detail() {
	}

	/** full constructor */
	public Detail(Unloading unloading, Drug drug, Integer detnumb) {
		this.unloading = unloading;
		this.drug = drug;
		this.detnumb = detnumb;
	}

	// Property accessors

	public Integer getDetId() {
		return this.detId;
	}

	public void setDetId(Integer detId) {
		this.detId = detId;
	}

	public Unloading getUnloading() {
		return this.unloading;
	}

	public void setUnloading(Unloading unloading) {
		this.unloading = unloading;
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Integer getDetnumb() {
		return this.detnumb;
	}

	public void setDetnumb(Integer detnumb) {
		this.detnumb = detnumb;
	}

}