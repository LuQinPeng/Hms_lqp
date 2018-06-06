package com.hms.entity;

/**
 * Dailydetail entity. @author MyEclipse Persistence Tools
 */

public class Dailydetail implements java.io.Serializable {

	// Fields

	private Integer pdxqId;
	private Inhospital inhospital;
	private Daily daily;
	private Integer pdxqNumber;
	private Float pdxqSubtotal;

	// Constructors

	/** default constructor */
	public Dailydetail() {
	}

	/** full constructor */
	public Dailydetail(Inhospital inhospital, Daily daily, Integer pdxqNumber, Float pdxqSubtotal) {
		this.inhospital = inhospital;
		this.daily = daily;
		this.pdxqNumber = pdxqNumber;
		this.pdxqSubtotal = pdxqSubtotal;
	}

	// Property accessors

	public Integer getPdxqId() {
		return this.pdxqId;
	}

	public void setPdxqId(Integer pdxqId) {
		this.pdxqId = pdxqId;
	}

	public Inhospital getInhospital() {
		return this.inhospital;
	}

	public void setInhospital(Inhospital inhospital) {
		this.inhospital = inhospital;
	}

	public Daily getDaily() {
		return this.daily;
	}

	public void setDaily(Daily daily) {
		this.daily = daily;
	}

	public Integer getPdxqNumber() {
		return this.pdxqNumber;
	}

	public void setPdxqNumber(Integer pdxqNumber) {
		this.pdxqNumber = pdxqNumber;
	}

	public Float getPdxqSubtotal() {
		return this.pdxqSubtotal;
	}

	public void setPdxqSubtotal(Float pdxqSubtotal) {
		this.pdxqSubtotal = pdxqSubtotal;
	}

}