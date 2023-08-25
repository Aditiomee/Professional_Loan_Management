package com.loan.loanapp.service;


import com.loan.loanapp.entity.LoanDisbursement;
import com.loan.loanapp.exception.LoanDisbursementException;

public interface LoanDisbursementService {
	
	LoanDisbursement getLoanDisbursementById(Integer id)throws LoanDisbursementException;
}
