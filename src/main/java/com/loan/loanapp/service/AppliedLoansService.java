package com.loan.loanapp.service;

import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.exception.AppliedLoansException;


public interface AppliedLoansService {
	AppliedLoans getAppliedLoansById(Integer id) throws AppliedLoansException;
	
	AppliedLoans deleteAppliedLoansById(Integer id) throws AppliedLoansException;
	
	AppliedLoans approveAppliedLoansById(Integer id) throws AppliedLoansException;



}
