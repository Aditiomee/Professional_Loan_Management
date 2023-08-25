package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.service.AppliedLoansService;

@RestController
public class AppliedLoansController {
	@Autowired
	AppliedLoansService appliedLoansService;
	
	@PostMapping("/appliedLoans")
	public String addCustomer(@RequestBody AppliedLoans appliedLoans) {
		
		return "Demo";
	}
}
