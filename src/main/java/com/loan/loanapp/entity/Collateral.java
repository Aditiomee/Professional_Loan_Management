package com.loan.loanapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Collateral {
	
	@Id
	private Integer collateralId;
	private String collateralType;
	private String collateralDescription;
	private Double CollateralValue;
	
	@OneToOne
	private Loan loan;
	@OneToOne
	private Customer customer;
	public Collateral() {
		super();
	}
	public Collateral(Integer collateralId, String collateralType, String collateralDescription, Double collateralValue,
			Loan loan, Customer customer) {
		super();
		this.collateralId = collateralId;
		this.collateralType = collateralType;
		this.collateralDescription = collateralDescription;
		CollateralValue = collateralValue;
		this.loan = loan;
		this.customer = customer;
	}
	public Integer getCollateralId() {
		return collateralId;
	}
	public void setCollateralId(Integer collateralId) {
		this.collateralId = collateralId;
	}
	public String getCollateralType() {
		return collateralType;
	}
	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}
	public String getCollateralDescription() {
		return collateralDescription;
	}
	public void setCollateralDescription(String collateralDescription) {
		this.collateralDescription = collateralDescription;
	}
	public Double getCollateralValue() {
		return CollateralValue;
	}
	public void setCollateralValue(Double collateralValue) {
		CollateralValue = collateralValue;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
