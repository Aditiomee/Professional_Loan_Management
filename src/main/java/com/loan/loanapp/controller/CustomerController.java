package com.loan.loanapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.service.CustomerService;
import com.loan.loanapp.service.MailService;

@RestController
public class CustomerController {
	@Autowired 
	CustomerService customerService;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	MailService mailService;
	
	@GetMapping("/")
	public String getGreeting() {
		return "welocome";
		
	}
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
    	String mail = customer.getCustomerEmail();
    	mailService.sendMail(mail, "You have Successfully registered","Dear "+customer.getCustomerName()+"/nYou have Successfully registered ." );
    	return this.customerRepo.save(customer);
    }



}
