package com.hms.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Prescriptionsubsidiary entity. @author MyEclipse Persistence Tools
 */

public class Prescriptionsubsidiary implements java.io.Serializable {

	// Fields

	private Integer psiId;
	private Recipe recipe;
	private Integer psiNumber;
	private Set drugstoragereps = new HashSet(0);

	// Constructors

	/** default constructor */
	public Prescriptionsubsidiary() {
	}

	/** full constructor */
	public Prescriptionsubsidiary(Recipe recipe, Integer psiNumber, Set drugstoragereps) {
		this.recipe = recipe;
		this.psiNumber = psiNumber;
		this.drugstoragereps = drugstoragereps;
	}

	// Property accessors

	public Integer getPsiId() {
		return this.psiId;
	}

	public void setPsiId(Integer psiId) {
		this.psiId = psiId;
	}

	public Recipe getRecipe() {
		return this.recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Integer getPsiNumber() {
		return this.psiNumber;
	}

	public void setPsiNumber(Integer psiNumber) {
		this.psiNumber = psiNumber;
	}

	public Set getDrugstoragereps() {
		return this.drugstoragereps;
	}

	public void setDrugstoragereps(Set drugstoragereps) {
		this.drugstoragereps = drugstoragereps;
	}

}