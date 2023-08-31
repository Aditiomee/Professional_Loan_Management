package com.loan.loanapp.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.dto.Login;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.service.CustomerService;
import com.loan.loanapp.service.MailService;
import com.loan.loanapp.service.LoansService;




@RestController
public class CustomerController {
	@Autowired 
	CustomerService customerService;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	MailService mailService;

	@Autowired
	LoansService loansService;
	

	@GetMapping("/")
	public String getGreeting() {
		return "welccome to our page";
		
	}
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
    	String mail = customer.getCustomerEmail();
    	mailService.sendMail(mail, "You have Successfully registered","Dear "+customer.getCustomerName()+"/nYou have Successfully registered ." );
    	return this.customerRepo.save(customer);
    }

    
    
    
    //Customer login
    @PostMapping("/login/")
    
    public ResponseEntity<String> login(@RequestBody Login loginDetailsDto) throws CustomerException  {
//    	String email = loginDetailsDto.getCustomerEmail();
//    	String password = loginDetailsDto.getCustomerPassword();
//    	this.customerService.validateCustomer(email,password);
//		return "Logged in successfully.";
    	if(this.customerService.validateCustomer(loginDetailsDto)) {
    		return ResponseEntity.status(HttpStatus.OK).body("login successful");
    	}
    	else {
    		return ResponseEntity.status(HttpStatus.OK).body("login failed Incorrect Password");
    		
    	}
    	
    	


    	
    }
    

  
   
    

    
    @PutMapping("/customer") 
	public Customer updateCustomer(@RequestBody Customer newCustomer) throws CustomerException {
		try {
			return this.customerService.updateCustomer(newCustomer);
		} catch (Exception e) {
			throw e;
		}
		
	}
    
    @DeleteMapping("/customer/{id}")
	public String deleteProduct(@PathVariable Integer id) throws CustomerException {
		return this.customerService.deleteCustomerById(id);
		
	}
    
    @GetMapping("/customer/{id}")
	public Customer getProductById(@PathVariable("id") Integer id) throws CustomerException {
		return this.customerService.getCustomerById(id);
	}
    
    @GetMapping("/customers")
	public Collection<Customer> getAllProducts() {
		Collection<Customer> customerCollection = this.customerService.getAllCustomers();
		return customerCollection;
	}
   
    @GetMapping("/loans")
   	public Collection<Loan> getAllLaons() {
   		Collection<Loan> loanCollection = this.loansService.getAllLoans();
   		return loanCollection;
   	}

    
    

   


}
