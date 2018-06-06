package com.hms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchas entity. @author MyEclipse Persistence Tools
 */

public class Purchas implements java.io.Serializable {

	// Fields

	private Integer purId;
	private Drugstorage drugstorage;
	private Float purPrice;
	private Date purIdate;
	private Integer purtes;
	private String purczyNmae;
	private String purysyName;
	private Set purchasedetailses = new HashSet(0);
	private Set suppliers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Purchas() {
	}

	/** full constructor */
	public Purchas(Drugstorage drugstorage, Float purPrice, Date purIdate, Integer purtes, String purczyNmae,
			String purysyName, Set purchasedetailses, Set suppliers) {
		this.drugstorage = drugstorage;
		this.purPrice = purPrice;
		this.purIdate = purIdate;
		this.purtes = purtes;
		this.purczyNmae = purczyNmae;
		this.purysyName = purysyName;
		this.purchasedetailses = purchasedetailses;
		this.suppliers = suppliers;
	}

	// Property accessors

	public Integer getPurId() {
		return this.purId;
	}

	public void setPurId(Integer purId) {
		this.purId = purId;
	}

	public Drugstorage getDrugstorage() {
		return this.drugstorage;
	}

	public void setDrugstorage(Drugstorage drugstorage) {
		this.drugstorage = drugstorage;
	}

	public Float getPurPrice() {
		return this.purPrice;
	}

	public void setPurPrice(Float purPrice) {
		this.purPrice = purPrice;
	}

	public Date getPurIdate() {
		return this.purIdate;
	}

	public void setPurIdate(Date purIdate) {
		this.purIdate = purIdate;
	}

	public Integer getPurtes() {
		return this.purtes;
	}

	public void setPurtes(Integer purtes) {
		this.purtes = purtes;
	}

	public String getPurczyNmae() {
		return this.purczyNmae;
	}

	public void setPurczyNmae(String purczyNmae) {
		this.purczyNmae = purczyNmae;
	}

	public String getPurysyName() {
		return this.purysyName;
	}

	public void setPurysyName(String purysyName) {
		this.purysyName = purysyName;
	}

	public Set getPurchasedetailses() {
		return this.purchasedetailses;
	}

	public void setPurchasedetailses(Set purchasedetailses) {
		this.purchasedetailses = purchasedetailses;
	}

	public Set getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(Set suppliers) {
		this.suppliers = suppliers;
	}

}