package com.loan.loanapp.controller;


import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.LoanDisbursementRepository;
import com.loan.loanapp.entity.LoanDisbursement;
import com.loan.loanapp.service.LoanDisbursementService;

@RestController
public class LoanDisbursementController {
	@Autowired
	LoanDisbursementService loanDisbursementService;
	
	@Autowired
	LoanDisbursementRepository loanDisbursementRepository;
	
	@PostMapping("/loanDisbursement")
	public LoanDisbursement addLoanDisbursement(@RequestBody LoanDisbursement loanDisbursement)
	{
		return this.loanDisbursementRepository.save(loanDisbursement);
	}
	
	@GetMapping("/customer/{id}")
    public LoanDisbursement getLoanDisbursmentById(@PathVariable Integer id) {
                    return this.loanDisbursementRepository.findById(id).get();
                   
    }
	
	@PostMapping("/loanDisbursements")
	public LoanDisbursement geLoanDisbursements(@RequestBody LoanDisbursement loanDisbursement)
	{
		return this.loanDisbursementRepository.save(loanDisbursement);
	}
	
	@GetMapping("/loanDisbursementAmount/{id}")
	public Collection<LoanDisbursement> getLoanDisbursementAmountById(@PathVariable Integer id) {
		return this.loanDisbursementService.geLoanDisbursements();
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
