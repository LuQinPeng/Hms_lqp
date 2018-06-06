package com.hms.entity;

import java.util.Date;

/**
 * Purchasedetails entity. @author MyEclipse Persistence Tools
 */

public class Purchasedetails implements java.io.Serializable {

	// Fields

	private Integer pdId;
	private Purchas purchas;
	private String pdName;
	private Float pdStockPrice;
	private Integer pdxqNumber;
	private Integer pdssNumber;
	private Date pdDate;
	private Date pdValidDate;

	// Constructors

	/** default constructor */
	public Purchasedetails() {
	}

	/** full constructor */
	public Purchasedetails(Purchas purchas, String pdName, Float pdStockPrice, Integer pdxqNumber, Integer pdssNumber,
			Date pdDate, Date pdValidDate) {
		this.purchas = purchas;
		this.pdName = pdName;
		this.pdStockPrice = pdStockPrice;
		this.pdxqNumber = pdxqNumber;
		this.pdssNumber = pdssNumber;
		this.pdDate = pdDate;
		this.pdValidDate = pdValidDate;
	}

	// Property accessors

	public Integer getPdId() {
		return this.pdId;
	}

	public void setPdId(Integer pdId) {
		this.pdId = pdId;
	}

	public Purchas getPurchas() {
		return this.purchas;
	}

	public void setPurchas(Purchas purchas) {
		this.purchas = purchas;
	}

	public String getPdName() {
		return this.pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public Float getPdStockPrice() {
		return this.pdStockPrice;
	}

	public void setPdStockPrice(Float pdStockPrice) {
		this.pdStockPrice = pdStockPrice;
	}

	public Integer getPdxqNumber() {
		return this.pdxqNumber;
	}

	public void setPdxqNumber(Integer pdxqNumber) {
		this.pdxqNumber = pdxqNumber;
	}

	public Integer getPdssNumber() {
		return this.pdssNumber;
	}

	public void setPdssNumber(Integer pdssNumber) {
		this.pdssNumber = pdssNumber;
	}

	public Date getPdDate() {
		return this.pdDate;
	}

	public void setPdDate(Date pdDate) {
		this.pdDate = pdDate;
	}

	public Date getPdValidDate() {
		return this.pdValidDate;
	}

	public void setPdValidDate(Date pdValidDate) {
		this.pdValidDate = pdValidDate;
	}

}