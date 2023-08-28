package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.http.ResponseEntity;

import com.loan.loanapp.dto.Login;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.exception.CustomerException;

public interface CustomerService {
	Customer addCustomer(Customer newCustomer)throws CustomerException;
	Customer deleteCustomerById(Integer id)throws CustomerException;
	
	Customer updateCustomer(Customer newCustomer)throws CustomerException;
	
	Customer getCustomerById(Integer id)throws CustomerException;
	
	Collection<Customer> getAllCustomers();
	
    Boolean validateCustomer(Login loginDetailsDto) throws CustomerException;

}
