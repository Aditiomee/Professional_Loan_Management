package com.loan.loanapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Loan {
 
	@Id
	private Integer loanId;
	private String loanType;
	private String loanName;
	private Double loanAmount;
	private Float loanIntrest;
	private Integer loanTenture;
	private Double loanEMI;
	private String loanDescription;
	private String status;
	
	
	@OneToOne
	private LoanDisbursement loanDisbursement;
	@OneToMany
	private List<Document> document = new ArrayList<Document>();



	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Float getLoanIntrest() {
		return loanIntrest;
	}

	public void setLoanIntrest(Float loanIntrest) {
		this.loanIntrest = loanIntrest;
	}

	public Integer getLoanTenture() {
		return loanTenture;
	}

	public void setLoanTenture(Integer loanTenture) {
		this.loanTenture = loanTenture;
	}

	public Double getLoanEMI() {
		return loanEMI;
	}

	public void setLoanEMI(Double loanEMI) {
		this.loanEMI = loanEMI;
	}

	public String getLoanDescription() {
		return loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}
	

	public LoanDisbursement getLoanDisbursement() {
		return loanDisbursement;
	}

	public void setLoanDisbursement(LoanDisbursement loanDisbursement) {
		this.loanDisbursement = loanDisbursement;
	}

	public List<Document> getDocument() {
		return document;
	}

	public void setDocument(List<Document> document) {
		this.document = document;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public Loan(Integer loanId, String loanType, String loanName, Double loanAmount, Float loanIntrest,
			Integer loanTenture, Double loanEMI, String loanDescription, String status,
			LoanDisbursement loanDisbursement, List<Document> document) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanName = loanName;
		this.loanAmount = loanAmount;
		this.loanIntrest = loanIntrest;
		this.loanTenture = loanTenture;
		this.loanEMI = loanEMI;
		this.loanDescription = loanDescription;
		this.status = status;
		this.loanDisbursement = loanDisbursement;
		this.document = document;
	}

	public Loan() {
		super();
		this.status="pending";
	}
	
	
	
	
}
