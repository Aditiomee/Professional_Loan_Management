package com.loan.loanapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanRepayment {
	
	@Id
	private Integer loanRepaymentId;
	private Integer monthlyAmountRepayed;
	private String repaymentRecipt;
	private LocalDate repaymentDate;
	private Double lateRepaymentPenalty;
	private Boolean loanRepaymentStatus;
	private LocalDate loanRepaymentDueDate;
	
	
	public Integer getLoanRepaymentId() {
		return loanRepaymentId;
	}
	public void setLoanRepaymentId(Integer loanRepaymentId) {
		this.loanRepaymentId = loanRepaymentId;
	}
	public String getRepaymentRecipt() {
		return repaymentRecipt;
	}
	public void setRepaymentRecipt(String repaymentRecipt) {
		this.repaymentRecipt = repaymentRecipt;
	}
	
	public Integer getMonthlyAmountRepayed() {
		return monthlyAmountRepayed;
	}
	public void setMonthlyAmountRepayed(Integer monthlyAmountRepayed) {
		this.monthlyAmountRepayed = monthlyAmountRepayed;
	}
	public LocalDate getRepaymentDate() {
		return repaymentDate;
	}
	public void setRepaymentDate(LocalDate repaymentDate) {
		this.repaymentDate = repaymentDate;
	}
	
	public Double getLateRepaymentPenalty() {
		return lateRepaymentPenalty;
	}
	public void setLateRepaymentPenalty(Double lateRepaymentPenalty) {
		this.lateRepaymentPenalty = lateRepaymentPenalty;
	}
	
	public Boolean getLoanRepaymentStatus() {
		return loanRepaymentStatus;
	}
	public void setLoanRepaymentStatus(Boolean loanRepaymentStatus) {
		this.loanRepaymentStatus = loanRepaymentStatus;
	}
	public LocalDate getLoanRepaymentDueDate() {
		return loanRepaymentDueDate;
	}
	public void setLoanRepaymentDueDate(LocalDate loanRepaymentDueDate) {
		this.loanRepaymentDueDate = loanRepaymentDueDate;
	}
	
	public LoanRepayment(Integer loanRepaymentId, Integer monthlyAmountRepayed, String repaymentRecipt,
			LocalDate repaymentDate, Double lateRepaymentPenalty, Boolean loanRepaymentStatus,
			LocalDate loanRepaymentDueDate) {
		super();
		this.loanRepaymentId = loanRepaymentId;
		this.monthlyAmountRepayed = monthlyAmountRepayed;
		this.repaymentRecipt = repaymentRecipt;
		this.repaymentDate = repaymentDate;
		this.lateRepaymentPenalty = lateRepaymentPenalty;
		this.loanRepaymentStatus = loanRepaymentStatus;
		this.loanRepaymentDueDate = loanRepaymentDueDate;
	}
	public LoanRepayment() {
		super();
	}
	
	
	
	
}
