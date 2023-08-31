package com.loan.loanapp.service;

import java.util.Collection;

import com.loan.loanapp.dto.LoanCalculatorDto;
import com.loan.loanapp.dto.LoanCalculatorResultDto;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;

public interface LoansService {
	Loan getLoansById(Integer id)throws LoansException;
	
	Collection<Loan> getAllLoans();
	
	LoanCalculatorResultDto calculateLoan(LoanCalculatorDto loanCalculatorDto);

	Loan updateLoanStatus(Integer id) throws LoansException;
}
