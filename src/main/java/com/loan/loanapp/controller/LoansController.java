package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.LoanRepaymentRepository;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.service.LoansService;

@RestController
public class LoansController {
	@Autowired
	LoansService loansService;
	
	
}
