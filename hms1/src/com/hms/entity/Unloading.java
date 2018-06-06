package com.hms.entity;

import java.util.Date;

/**
 * Unloading entity. @author MyEclipse Persistence Tools
 */

public class Unloading implements java.io.Serializable {

	// Fields

	private Integer unlId;
	private Integer dsrId;
	private Date unldate;
	private String unlstate;
	private Integer unlNumber;
	private String unlname;

	// Constructors

	/** default constructor */
	public Unloading() {
	}

	/** full constructor */
	public Unloading(Integer dsrId, Date unldate, String unlstate, Integer unlNumber, String unlname) {
		this.dsrId = dsrId;
		this.unldate = unldate;
		this.unlstate = unlstate;
		this.unlNumber = unlNumber;
		this.unlname = unlname;
	}

	// Property accessors

	public Integer getUnlId() {
		return this.unlId;
	}

	public void setUnlId(Integer unlId) {
		this.unlId = unlId;
	}

	public Integer getDsrId() {
		return this.dsrId;
	}

	public void setDsrId(Integer dsrId) {
		this.dsrId = dsrId;
	}

	public Date getUnldate() {
		return this.unldate;
	}

	public void setUnldate(Date unldate) {
		this.unldate = unldate;
	}

	public String getUnlstate() {
		return this.unlstate;
	}

	public void setUnlstate(String unlstate) {
		this.unlstate = unlstate;
	}

	public Integer getUnlNumber() {
		return this.unlNumber;
	}

	public void setUnlNumber(Integer unlNumber) {
		this.unlNumber = unlNumber;
	}

	public String getUnlname() {
		return this.unlname;
	}

	public void setUnlname(String unlname) {
		this.unlname = unlname;
	}

}