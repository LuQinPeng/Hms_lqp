package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Daily entity. @author MyEclipse Persistence Tools
 */

public class Daily implements java.io.Serializable {

	// Fields

	private Integer dailyId;
	private Advicedetail advicedetail;
	private Employee employee;
	private Float dailyTotalPrice;
	private Date dailyDate;
	private Set dailydetails = new HashSet(0);
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Daily() {
	}

	/** full constructor */
	public Daily(Advicedetail advicedetail, Employee employee, Float dailyTotalPrice, Date dailyDate, Set dailydetails,
			Set employees) {
		this.advicedetail = advicedetail;
		this.employee = employee;
		this.dailyTotalPrice = dailyTotalPrice;
		this.dailyDate = dailyDate;
		this.dailydetails = dailydetails;
		this.employees = employees;
	}

	// Property accessors

	public Integer getDailyId() {
		return this.dailyId;
	}

	public void setDailyId(Integer dailyId) {
		this.dailyId = dailyId;
	}

	public Advicedetail getAdvicedetail() {
		return this.advicedetail;
	}

	public void setAdvicedetail(Advicedetail advicedetail) {
		this.advicedetail = advicedetail;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Float getDailyTotalPrice() {
		return this.dailyTotalPrice;
	}

	public void setDailyTotalPrice(Float dailyTotalPrice) {
		this.dailyTotalPrice = dailyTotalPrice;
	}

	public Date getDailyDate() {
		return this.dailyDate;
	}

	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}

	public Set getDailydetails() {
		return this.dailydetails;
	}

	public void setDailydetails(Set dailydetails) {
		this.dailydetails = dailydetails;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}