package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Loan;

public interface BankService {
	
	
	Collection<Loan> getAllLoans();
}
