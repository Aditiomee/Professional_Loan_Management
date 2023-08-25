package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.AppliedLoansRepository;
import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.exception.AppliedLoansException;

@Service
public class AppliedLoansServiceImpl implements AppliedLoansService {

	@Autowired
	AppliedLoansRepository appliedLoansRepo;
	
	@Override
	public AppliedLoans getAppliedLoansById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppliedLoans deleteAppliedLoansById(Integer id) throws AppliedLoansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppliedLoans approveAppliedLoansById(Integer id) throws AppliedLoansException {
		// TODO Auto-generated method stub
		return null;
	}

}
