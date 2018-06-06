package com.hms.entity;

/**
 * Checkresult entity. @author MyEclipse Persistence Tools
 */

public class Checkresult implements java.io.Serializable {

	// Fields

	private Integer resultId;
	private Checks checks;
	private String resuName;
	private String resuValue;
	private String resultDetails;

	// Constructors

	/** default constructor */
	public Checkresult() {
	}

	/** full constructor */
	public Checkresult(Checks checks, String resuName, String resuValue, String resultDetails) {
		this.checks = checks;
		this.resuName = resuName;
		this.resuValue = resuValue;
		this.resultDetails = resultDetails;
	}

	// Property accessors

	public Integer getResultId() {
		return this.resultId;
	}

	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}

	public Checks getChecks() {
		return this.checks;
	}

	public void setChecks(Checks checks) {
		this.checks = checks;
	}

	public String getResuName() {
		return this.resuName;
	}

	public void setResuName(String resuName) {
		this.resuName = resuName;
	}

	public String getResuValue() {
		return this.resuValue;
	}

	public void setResuValue(String resuValue) {
		this.resuValue = resuValue;
	}

	public String getResultDetails() {
		return this.resultDetails;
	}

	public void setResultDetails(String resultDetails) {
		this.resultDetails = resultDetails;
	}

}