package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Recipe entity. @author MyEclipse Persistence Tools
 */

public class Recipe implements java.io.Serializable {

	// Fields

	private Integer recipeId;
	private Employee employee;
	private Casehistory casehistory;
	private Float recipeTotal;
	private Date recipeDate;
	private Set prescriptionsubsidiaries = new HashSet(0);

	// Constructors

	/** default constructor */
	public Recipe() {
	}

	/** full constructor */
	public Recipe(Employee employee, Casehistory casehistory, Float recipeTotal, Date recipeDate,
			Set prescriptionsubsidiaries) {
		this.employee = employee;
		this.casehistory = casehistory;
		this.recipeTotal = recipeTotal;
		this.recipeDate = recipeDate;
		this.prescriptionsubsidiaries = prescriptionsubsidiaries;
	}

	// Property accessors

	public Integer getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Casehistory getCasehistory() {
		return this.casehistory;
	}

	public void setCasehistory(Casehistory casehistory) {
		this.casehistory = casehistory;
	}

	public Float getRecipeTotal() {
		return this.recipeTotal;
	}

	public void setRecipeTotal(Float recipeTotal) {
		this.recipeTotal = recipeTotal;
	}

	public Date getRecipeDate() {
		return this.recipeDate;
	}

	public void setRecipeDate(Date recipeDate) {
		this.recipeDate = recipeDate;
	}

	public Set getPrescriptionsubsidiaries() {
		return this.prescriptionsubsidiaries;
	}

	public void setPrescriptionsubsidiaries(Set prescriptionsubsidiaries) {
		this.prescriptionsubsidiaries = prescriptionsubsidiaries;
	}

}