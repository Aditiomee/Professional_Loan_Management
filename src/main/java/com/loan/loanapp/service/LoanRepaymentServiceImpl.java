package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoanRepaymentRepository;
import com.loan.loanapp.entity.LoanRepayment;


@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService {
	
	@Autowired
	LoanRepaymentRepository loanRepaymentRepo;

	@Override
	public LoanRepayment getLoanRepaymentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
