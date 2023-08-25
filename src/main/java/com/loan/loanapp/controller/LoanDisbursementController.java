package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.LoanDisbursementRepository;
import com.loan.loanapp.service.LoanDisbursementService;

@RestController
public class LoanDisbursementController {
	@Autowired
	LoanDisbursementService loanDisbursementService;
	
	


}
