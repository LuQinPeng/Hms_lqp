package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Hospital entity. @author MyEclipse Persistence Tools
 */

public class Hospital implements java.io.Serializable {

	// Fields

	private Integer hospitalId;
	private Employee employee;
	private Ic ic;
	private Bed bed;
	private Date hospitalDate;
	private Date hospitalLeave;
	private String hospitalLounge;
	private String hospitalLast;
	private Set beds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Hospital() {
	}

	/** full constructor */
	public Hospital(Employee employee, Ic ic, Bed bed, Date hospitalDate, Date hospitalLeave, String hospitalLounge,
			String hospitalLast, Set beds) {
		this.employee = employee;
		this.ic = ic;
		this.bed = bed;
		this.hospitalDate = hospitalDate;
		this.hospitalLeave = hospitalLeave;
		this.hospitalLounge = hospitalLounge;
		this.hospitalLast = hospitalLast;
		this.beds = beds;
	}

	// Property accessors

	public Integer getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
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

	public Bed getBed() {
		return this.bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}

	public Date getHospitalDate() {
		return this.hospitalDate;
	}

	public void setHospitalDate(Date hospitalDate) {
		this.hospitalDate = hospitalDate;
	}

	public Date getHospitalLeave() {
		return this.hospitalLeave;
	}

	public void setHospitalLeave(Date hospitalLeave) {
		this.hospitalLeave = hospitalLeave;
	}

	public String getHospitalLounge() {
		return this.hospitalLounge;
	}

	public void setHospitalLounge(String hospitalLounge) {
		this.hospitalLounge = hospitalLounge;
	}

	public String getHospitalLast() {
		return this.hospitalLast;
	}

	public void setHospitalLast(String hospitalLast) {
		this.hospitalLast = hospitalLast;
	}

	public Set getBeds() {
		return this.beds;
	}

	public void setBeds(Set beds) {
		this.beds = beds;
	}

}