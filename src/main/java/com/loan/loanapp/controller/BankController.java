package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.BankRepository;
import com.loan.loanapp.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankService;
	
	

}
