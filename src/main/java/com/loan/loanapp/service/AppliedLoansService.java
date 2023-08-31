package com.loan.loanapp.service;

import java.util.Collection;

import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.AppliedLoansException;


public interface AppliedLoansService {
	
	AppliedLoans getAppliedLoansById(Integer id) throws AppliedLoansException;
	
	AppliedLoans deleteAppliedLoansById(Integer id) throws AppliedLoansException;
	
	Collection<AppliedLoans> getAllAppliedLoans() throws AppliedLoansException;

}
