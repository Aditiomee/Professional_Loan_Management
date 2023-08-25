package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Loan;


@Service
public class LoansServiceImpl implements LoansService{
	
	@Autowired
	LoansRepository loansRepo;


	@Override
	public Loan getLoansById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

}
