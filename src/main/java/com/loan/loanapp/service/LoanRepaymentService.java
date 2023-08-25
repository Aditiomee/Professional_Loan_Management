package com.loan.loanapp.service;


import java.util.Collection;

import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.LoanRepayment;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.exception.LoanRepaymentException;

public interface LoanRepaymentService {
	
	LoanRepayment addRepayment(LoanRepayment newRepayment)throws LoanRepaymentException;

	LoanRepayment getLoanRepaymentById(Integer id) throws LoanRepaymentException;
	
	Collection<LoanRepayment> getAllRepayments();

}
