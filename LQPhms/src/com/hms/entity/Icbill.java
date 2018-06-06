package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Icbill entity. @author MyEclipse Persistence Tools
 */

public class Icbill implements java.io.Serializable {

	// Fields

	private Integer icbillId;
	private Ic ic;
	private Float icbillTotalSum;
	private Date icbillDate;
	private Set expenses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Icbill() {
	}

	/** full constructor */
	public Icbill(Ic ic, Float icbillTotalSum, Date icbillDate, Set expenses) {
		this.ic = ic;
		this.icbillTotalSum = icbillTotalSum;
		this.icbillDate = icbillDate;
		this.expenses = expenses;
	}

	// Property accessors

	public Integer getIcbillId() {
		return this.icbillId;
	}

	public void setIcbillId(Integer icbillId) {
		this.icbillId = icbillId;
	}

	public Ic getIc() {
		return this.ic;
	}

	public void setIc(Ic ic) {
		this.ic = ic;
	}

	public Float getIcbillTotalSum() {
		return this.icbillTotalSum;
	}

	public void setIcbillTotalSum(Float icbillTotalSum) {
		this.icbillTotalSum = icbillTotalSum;
	}

	public Date getIcbillDate() {
		return this.icbillDate;
	}

	public void setIcbillDate(Date icbillDate) {
		this.icbillDate = icbillDate;
	}

	public Set getExpenses() {
		return this.expenses;
	}

	public void setExpenses(Set expenses) {
		this.expenses = expenses;
	}

}