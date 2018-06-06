package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Casehistory entity. @author MyEclipse Persistence Tools
 */

public class Casehistory implements java.io.Serializable {

	// Fields

	private Integer caseId;
	private Employee employee;
	private Ic ic;
	private String previous;
	private String family;
	private String diagnosis;
	private String dispose;
	private Date clinic;
	private Set recipes = new HashSet(0);
	private Set checklists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Casehistory() {
	}

	/** full constructor */
	public Casehistory(Employee employee, Ic ic, String previous, String family, String diagnosis, String dispose,
			Date clinic, Set recipes, Set checklists) {
		this.employee = employee;
		this.ic = ic;
		this.previous = previous;
		this.family = family;
		this.diagnosis = diagnosis;
		this.dispose = dispose;
		this.clinic = clinic;
		this.recipes = recipes;
		this.checklists = checklists;
	}

	// Property accessors

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
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

	public String getPrevious() {
		return this.previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDispose() {
		return this.dispose;
	}

	public void setDispose(String dispose) {
		this.dispose = dispose;
	}

	public Date getClinic() {
		return this.clinic;
	}

	public void setClinic(Date clinic) {
		this.clinic = clinic;
	}

	public Set getRecipes() {
		return this.recipes;
	}

	public void setRecipes(Set recipes) {
		this.recipes = recipes;
	}

	public Set getChecklists() {
		return this.checklists;
	}

	public void setChecklists(Set checklists) {
		this.checklists = checklists;
	}

}