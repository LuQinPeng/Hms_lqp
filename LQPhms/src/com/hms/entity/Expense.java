package com.hms.entity;

/**
 * Expense entity. @author MyEclipse Persistence Tools
 */

public class Expense implements java.io.Serializable {

	// Fields

	private Integer expenseId;
	private Icbill icbill;
	private String expenseBus;
	private Float expensePrice;
	private String expenseDeta;

	// Constructors

	/** default constructor */
	public Expense() {
	}

	/** full constructor */
	public Expense(Icbill icbill, String expenseBus, Float expensePrice, String expenseDeta) {
		this.icbill = icbill;
		this.expenseBus = expenseBus;
		this.expensePrice = expensePrice;
		this.expenseDeta = expenseDeta;
	}

	// Property accessors

	public Integer getExpenseId() {
		return this.expenseId;
	}

	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}

	public Icbill getIcbill() {
		return this.icbill;
	}

	public void setIcbill(Icbill icbill) {
		this.icbill = icbill;
	}

	public String getExpenseBus() {
		return this.expenseBus;
	}

	public void setExpenseBus(String expenseBus) {
		this.expenseBus = expenseBus;
	}

	public Float getExpensePrice() {
		return this.expensePrice;
	}

	public void setExpensePrice(Float expensePrice) {
		this.expensePrice = expensePrice;
	}

	public String getExpenseDeta() {
		return this.expenseDeta;
	}

	public void setExpenseDeta(String expenseDeta) {
		this.expenseDeta = expenseDeta;
	}

}