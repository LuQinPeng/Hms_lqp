package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Checklist entity. @author MyEclipse Persistence Tools
 */

public class Checklist implements java.io.Serializable {

	// Fields

	private Integer checklistId;
	private Casehistory casehistory;
	private Date checklistDate;
	private Integer checklistState;
	private Set sickchecks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checklist() {
	}

	/** full constructor */
	public Checklist(Casehistory casehistory, Date checklistDate, Integer checklistState, Set sickchecks) {
		this.casehistory = casehistory;
		this.checklistDate = checklistDate;
		this.checklistState = checklistState;
		this.sickchecks = sickchecks;
	}

	// Property accessors

	public Integer getChecklistId() {
		return this.checklistId;
	}

	public void setChecklistId(Integer checklistId) {
		this.checklistId = checklistId;
	}

	public Casehistory getCasehistory() {
		return this.casehistory;
	}

	public void setCasehistory(Casehistory casehistory) {
		this.casehistory = casehistory;
	}

	public Date getChecklistDate() {
		return this.checklistDate;
	}

	public void setChecklistDate(Date checklistDate) {
		this.checklistDate = checklistDate;
	}

	public Integer getChecklistState() {
		return this.checklistState;
	}

	public void setChecklistState(Integer checklistState) {
		this.checklistState = checklistState;
	}

	public Set getSickchecks() {
		return this.sickchecks;
	}

	public void setSickchecks(Set sickchecks) {
		this.sickchecks = sickchecks;
	}

}