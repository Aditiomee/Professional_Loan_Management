package com.loan.loanapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private Integer bankId;
	private String BankName;
	private Integer Bankcode;
	private String BankAddress;
	private Integer BankPhoneNumber;
	
	
	@OneToMany
	private List<LoanDisbursement> loanDisbursement = new ArrayList<LoanDisbursement>();
	@OneToMany
	private List<Loan> loans = new ArrayList<Loan>();
	public Bank() {
		super();
	}
	public Bank(Integer bankId, String bankName, Integer bankcode, String bankAddress, Integer bankPhoneNumber,
			List<LoanDisbursement> loanDisbursement, List<Loan> loans) {
		super();
		this.bankId = bankId;
		BankName = bankName;
		Bankcode = bankcode;
		BankAddress = bankAddress;
		BankPhoneNumber = bankPhoneNumber;
		this.loanDisbursement = loanDisbursement;
		this.loans = loans;
	}
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public Integer getBankcode() {
		return Bankcode;
	}
	public void setBankcode(Integer bankcode) {
		Bankcode = bankcode;
	}
	public String getBankAddress() {
		return BankAddress;
	}
	public void setBankAddress(String bankAddress) {
		BankAddress = bankAddress;
	}
	public Integer getBankPhoneNumber() {
		return BankPhoneNumber;
	}
	public void setBankPhoneNumber(Integer bankPhoneNumber) {
		BankPhoneNumber = bankPhoneNumber;
	}
	public List<LoanDisbursement> getLoanDisbursement() {
		return loanDisbursement;
	}
	public void setLoanDisbursement(List<LoanDisbursement> loanDisbursement) {
		this.loanDisbursement = loanDisbursement;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	
	

	
}
