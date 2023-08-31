package com.loan.loanapp.service;

import java.util.Collection;

import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.exception.LoansException;

public interface LoansService {
	Loan addLoan(Loan newLoan)throws LoansException;
    String deleteLoanById(Integer id)throws LoansException;
	Loan updateLoan(Loan newCustomer)throws LoansException;
	Loan getLoansById(Integer id)throws LoansException;
	
	Collection<Loan> getAllLoans();
}