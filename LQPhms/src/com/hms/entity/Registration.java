package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Registration entity. @author MyEclipse Persistence Tools
 */

public class Registration implements java.io.Serializable {

	// Fields

	private Integer regId;
	private Ic ic;
	private Regdetails regdetails;
	private Float regPrice;
	private Set regdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Registration() {
	}

	/** full constructor */
	public Registration(Ic ic, Regdetails regdetails, Float regPrice, Set regdetailses) {
		this.ic = ic;
		this.regdetails = regdetails;
		this.regPrice = regPrice;
		this.regdetailses = regdetailses;
	}

	// Property accessors

	public Integer getRegId() {
		return this.regId;
	}

	public void setRegId(Integer regId) {
		this.regId = regId;
	}

	public Ic getIc() {
		return this.ic;
	}

	public void setIc(Ic ic) {
		this.ic = ic;
	}

	public Regdetails getRegdetails() {
		return this.regdetails;
	}

	public void setRegdetails(Regdetails regdetails) {
		this.regdetails = regdetails;
	}

	public Float getRegPrice() {
		return this.regPrice;
	}

	public void setRegPrice(Float regPrice) {
		this.regPrice = regPrice;
	}

	public Set getRegdetailses() {
		return this.regdetailses;
	}

	public void setRegdetailses(Set regdetailses) {
		this.regdetailses = regdetailses;
	}

}