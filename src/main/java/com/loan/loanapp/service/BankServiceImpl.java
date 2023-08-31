package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.BankRepository;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.entity.LoanDisbursement;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	BankRepository bankRepo;

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanDisbursement disburseLoanById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<LoanDisbursement> getAllDisbursedLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<LoanDisbursement> getLoanDisbursementById() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
