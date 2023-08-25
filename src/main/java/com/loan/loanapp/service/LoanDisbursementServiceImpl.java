package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoanDisbursementRepository;
import com.loan.loanapp.entity.LoanDisbursement;


@Service
public class LoanDisbursementServiceImpl implements LoanDisbursementService{
	
	@Autowired
	LoanDisbursementRepository loanDisbursementRepo;

	@Override
	public LoanDisbursement getLoanDisbursementById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
