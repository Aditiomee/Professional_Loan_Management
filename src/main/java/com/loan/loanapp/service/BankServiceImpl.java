package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.BankRepository;
import com.loan.loanapp.entity.Loan;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	BankRepository bankRepo;

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

}
