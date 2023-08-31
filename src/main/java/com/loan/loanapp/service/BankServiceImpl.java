package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.BankRepository;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	BankRepository bankRepo;
	@Autowired
	LoansRepository loanRepo;

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return this.loanRepo.findAll();
	}

}
