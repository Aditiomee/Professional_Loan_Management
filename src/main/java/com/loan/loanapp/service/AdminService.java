package com.loan.loanapp.service;

import java.util.Collection;

import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.AppliedLoansException;
import com.loan.loanapp.exception.LoansException;


public interface AdminService {

	Loan approveLoan(Loan loan, Customer customer) throws LoansException;
	
	
	
	Collection<Loan> getPendingLoans() throws LoansException;
	
	Collection<Loan> getApprovedLoans() throws LoansException;

	Collection<Loan> getAllLoans() throws LoansException;
	
	Loan viewLoanById(Integer id) throws LoansException;
	
//	Loan moveApprovedLoansToLoanDisbursement() throws LoansException;
}
