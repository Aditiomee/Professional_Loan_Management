package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.dto.Login;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired 
	CustomerService customerService;
	@GetMapping("/")
	public String getGreeting() {
		return "welocome";
		
	}
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) throws CustomerException {
                    return this.customerService.addCustomer(customer);
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
    

  
   
    
    
    

   


}
