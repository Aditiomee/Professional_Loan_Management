package com.loan.loanapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AppliedLoans {
	@Id
	private Integer applicationId;
	private Boolean status;

	@ManyToOne
	Customer customer;
	
	@ManyToOne
	Admin admin;

	public AppliedLoans() {
		super();
	}

	
	public AppliedLoans(Integer applicationId, Boolean status, Customer customer, Admin admin) {
		super();
		this.applicationId = applicationId;
		this.status = status;
		this.customer = customer;
		this.admin = admin;
	}


	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
}
