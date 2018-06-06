package com.hms.entity;

import java.util.Date;

/**
 * Ictopup entity. @author MyEclipse Persistence Tools
 */

public class Ictopup implements java.io.Serializable {

	// Fields

	private Integer ictopUpId;
	private Ic ic;
	private Float ictopUpMoney;
	private Date ictopUpDate;

	// Constructors

	/** default constructor */
	public Ictopup() {
	}

	/** full constructor */
	public Ictopup(Ic ic, Float ictopUpMoney, Date ictopUpDate) {
		this.ic = ic;
		this.ictopUpMoney = ictopUpMoney;
		this.ictopUpDate = ictopUpDate;
	}

	// Property accessors

	public Integer getIctopUpId() {
		return this.ictopUpId;
	}

	public void setIctopUpId(Integer ictopUpId) {
		this.ictopUpId = ictopUpId;
	}

	public Ic getIc() {
		return this.ic;
	}

	public void setIc(Ic ic) {
		this.ic = ic;
	}

	public Float getIctopUpMoney() {
		return this.ictopUpMoney;
	}

	public void setIctopUpMoney(Float ictopUpMoney) {
		this.ictopUpMoney = ictopUpMoney;
	}

	public Date getIctopUpDate() {
		return this.ictopUpDate;
	}

	public void setIctopUpDate(Date ictopUpDate) {
		this.ictopUpDate = ictopUpDate;
	}

}