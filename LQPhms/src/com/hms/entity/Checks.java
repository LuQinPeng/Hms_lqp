package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Checks entity. @author MyEclipse Persistence Tools
 */

public class Checks implements java.io.Serializable {

	// Fields

	private Integer checkId;
	private Sickcheck sickcheck;
	private String checkName;
	private Float checkPrice;
	private Set checkresults = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checks() {
	}

	/** full constructor */
	public Checks(Sickcheck sickcheck, String checkName, Float checkPrice, Set checkresults) {
		this.sickcheck = sickcheck;
		this.checkName = checkName;
		this.checkPrice = checkPrice;
		this.checkresults = checkresults;
	}

	// Property accessors

	public Integer getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Sickcheck getSickcheck() {
		return this.sickcheck;
	}

	public void setSickcheck(Sickcheck sickcheck) {
		this.sickcheck = sickcheck;
	}

	public String getCheckName() {
		return this.checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public Float getCheckPrice() {
		return this.checkPrice;
	}

	public void setCheckPrice(Float checkPrice) {
		this.checkPrice = checkPrice;
	}

	public Set getCheckresults() {
		return this.checkresults;
	}

	public void setCheckresults(Set checkresults) {
		this.checkresults = checkresults;
	}

}