package com.loan.loanapp.service;


import com.loan.loanapp.entity.LoanRepayment;
import com.loan.loanapp.exception.LoanRepaymentException;

public interface LoanRepaymentService {

	LoanRepayment getLoanRepaymentById(Integer id) throws LoanRepaymentException;
  
	
	
}


