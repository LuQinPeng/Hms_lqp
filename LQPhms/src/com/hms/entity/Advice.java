package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Advice entity. @author MyEclipse Persistence Tools
 */

public class Advice implements java.io.Serializable {

	// Fields

	private Integer adviceId;
	private Employee employee;
	private Ic ic;
	private Integer adviceSort;
	private Integer adviceState;
	private Date adviceDate;
	private Set advicedetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Advice() {
	}

	/** full constructor */
	public Advice(Employee employee, Ic ic, Integer adviceSort, Integer adviceState, Date adviceDate,
			Set advicedetails) {
		this.employee = employee;
		this.ic = ic;
		this.adviceSort = adviceSort;
		this.adviceState = adviceState;
		this.adviceDate = adviceDate;
		this.advicedetails = advicedetails;
	}

	// Property accessors

	public Integer getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(Integer adviceId) {
		this.adviceId = adviceId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Ic getIc() {
		return this.ic;
	}

	public void setIc(Ic ic) {
		this.ic = ic;
	}

	public Integer getAdviceSort() {
		return this.adviceSort;
	}

	public void setAdviceSort(Integer adviceSort) {
		this.adviceSort = adviceSort;
	}

	public Integer getAdviceState() {
		return this.adviceState;
	}

	public void setAdviceState(Integer adviceState) {
		this.adviceState = adviceState;
	}

	public Date getAdviceDate() {
		return this.adviceDate;
	}

	public void setAdviceDate(Date adviceDate) {
		this.adviceDate = adviceDate;
	}

	public Set getAdvicedetails() {
		return this.advicedetails;
	}

	public void setAdvicedetails(Set advicedetails) {
		this.advicedetails = advicedetails;
	}

}