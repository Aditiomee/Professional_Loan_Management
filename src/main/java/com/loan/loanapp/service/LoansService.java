package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;

public interface LoansService {
	Loan getLoansById(Integer id)throws LoansException;
	
	Collection<Loan> getAllLoans();
}
