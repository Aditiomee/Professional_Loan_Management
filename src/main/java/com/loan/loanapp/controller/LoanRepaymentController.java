package com.loan.loanapp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.LoanRepaymentRepository;
import com.loan.loanapp.entity.LoanRepayment;
import com.loan.loanapp.exception.LoanRepaymentException;
import com.loan.loanapp.service.LoanRepaymentService;
import com.loan.loanapp.service.LoansService;

@RestController
public class LoanRepaymentController {
	@Autowired
	LoanRepaymentService loanRepaymentService;
	
	@Autowired
	LoansService loansService;
	
	@Autowired
	LoanRepaymentRepository loanRepaymentRepo;
	
	@PostMapping("/loanrepayment")
    public LoanRepayment addRepayment(@RequestBody LoanRepayment newRepayment) {
                   
                    return this.loanRepaymentRepo.save(newRepayment);
    }
    
  
   
    @GetMapping("/loanrepayment/{id}")
     public LoanRepayment getLoanRepaymentById(@PathVariable("id") Integer id)throws LoanRepaymentException {
          return this.loanRepaymentService.getLoanRepaymentById(id);
     }
    
    @GetMapping("/loanrepayments")
    public Collection<LoanRepayment> getAllRepayments(){
         Collection<LoanRepayment> allRepayments = this.loanRepaymentService.getAllRepayments();
         return allRepayments;
    }
	


}
