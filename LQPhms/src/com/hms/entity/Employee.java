package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private Daily daily;
	private Office office;
	private String empName;
	private String empGender;
	private Integer empPhone;
	private String empCard;
	private String empPassword;
	private String empAddress;
	private Date empTime;
	private Set dailies = new HashSet(0);
	private Set recipes = new HashSet(0);
	private Set casehistories = new HashSet(0);
	private Set sickchecks = new HashSet(0);
	private Set loginLogouts = new HashSet(0);
	private Set advices = new HashSet(0);
	private Set hospitals = new HashSet(0);
	private Set roleUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Daily daily, Office office, String empName, String empGender, Integer empPhone, String empCard,
			String empPassword, String empAddress, Date empTime, Set dailies, Set recipes, Set casehistories,
			Set sickchecks, Set loginLogouts, Set advices, Set hospitals, Set roleUsers) {
		this.daily = daily;
		this.office = office;
		this.empName = empName;
		this.empGender = empGender;
		this.empPhone = empPhone;
		this.empCard = empCard;
		this.empPassword = empPassword;
		this.empAddress = empAddress;
		this.empTime = empTime;
		this.dailies = dailies;
		this.recipes = recipes;
		this.casehistories = casehistories;
		this.sickchecks = sickchecks;
		this.loginLogouts = loginLogouts;
		this.advices = advices;
		this.hospitals = hospitals;
		this.roleUsers = roleUsers;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Daily getDaily() {
		return this.daily;
	}

	public void setDaily(Daily daily) {
		this.daily = daily;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return this.empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public Integer getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(Integer empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpCard() {
		return this.empCard;
	}

	public void setEmpCard(String empCard) {
		this.empCard = empCard;
	}

	public String getEmpPassword() {
		return this.empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpAddress() {
		return this.empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Date getEmpTime() {
		return this.empTime;
	}

	public void setEmpTime(Date empTime) {
		this.empTime = empTime;
	}

	public Set getDailies() {
		return this.dailies;
	}

	public void setDailies(Set dailies) {
		this.dailies = dailies;
	}

	public Set getRecipes() {
		return this.recipes;
	}

	public void setRecipes(Set recipes) {
		this.recipes = recipes;
	}

	public Set getCasehistories() {
		return this.casehistories;
	}

	public void setCasehistories(Set casehistories) {
		this.casehistories = casehistories;
	}

	public Set getSickchecks() {
		return this.sickchecks;
	}

	public void setSickchecks(Set sickchecks) {
		this.sickchecks = sickchecks;
	}

	public Set getLoginLogouts() {
		return this.loginLogouts;
	}

	public void setLoginLogouts(Set loginLogouts) {
		this.loginLogouts = loginLogouts;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

	public Set getHospitals() {
		return this.hospitals;
	}

	public void setHospitals(Set hospitals) {
		this.hospitals = hospitals;
	}

	public Set getRoleUsers() {
		return this.roleUsers;
	}

	public void setRoleUsers(Set roleUsers) {
		this.roleUsers = roleUsers;
	}

}