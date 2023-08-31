package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.loan.loanapp.dto.LoanCalculatorDto;
import com.loan.loanapp.dto.LoanCalculatorResultDto;

import com.loan.loanapp.service.LoansService;

@RestController
public class LoansController {
	@Autowired
	LoansService loansService;
	
	@PostMapping("/calculate")
    public LoanCalculatorResultDto calculateLoan(@RequestBody LoanCalculatorDto loanCalculatorDto) {
		return loansService.calculateLoan(loanCalculatorDto);
    }
	
	
}
