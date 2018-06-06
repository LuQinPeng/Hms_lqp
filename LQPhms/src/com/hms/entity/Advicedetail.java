package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Advicedetail entity. @author MyEclipse Persistence Tools
 */

public class Advicedetail implements java.io.Serializable {

	// Fields

	private Integer adId;
	private Advice advice;
	private String adProject;
	private Integer adNumber;
	private Integer adType;
	private Set dailies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Advicedetail() {
	}

	/** full constructor */
	public Advicedetail(Advice advice, String adProject, Integer adNumber, Integer adType, Set dailies) {
		this.advice = advice;
		this.adProject = adProject;
		this.adNumber = adNumber;
		this.adType = adType;
		this.dailies = dailies;
	}

	// Property accessors

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public Advice getAdvice() {
		return this.advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public String getAdProject() {
		return this.adProject;
	}

	public void setAdProject(String adProject) {
		this.adProject = adProject;
	}

	public Integer getAdNumber() {
		return this.adNumber;
	}

	public void setAdNumber(Integer adNumber) {
		this.adNumber = adNumber;
	}

	public Integer getAdType() {
		return this.adType;
	}

	public void setAdType(Integer adType) {
		this.adType = adType;
	}

	public Set getDailies() {
		return this.dailies;
	}

	public void setDailies(Set dailies) {
		this.dailies = dailies;
	}

}