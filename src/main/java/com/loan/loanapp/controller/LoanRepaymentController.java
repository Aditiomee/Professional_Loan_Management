package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.LoanRepaymentRepository;
import com.loan.loanapp.service.LoanRepaymentService;

@RestController
public class LoanRepaymentController {
	@Autowired
	LoanRepaymentService loanRepaymentService;
	
	


}
