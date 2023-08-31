package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.entity.LoanDisbursement;
import com.loan.loanapp.entity.LoanRepayment;

public interface BankService {
	
	Collection<Loan> getAllLoans();
	
	LoanDisbursement disburseLoanById(Integer id);
	
	Collection<LoanDisbursement> getAllDisbursedLoans();
	
	Collection<LoanDisbursement> getLoanDisbursementById();
	
	
}
