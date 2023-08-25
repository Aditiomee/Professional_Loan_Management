package com.loan.loanapp.service;

import java.util.Collection;

import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.CustomerException;

public interface CustomerService {
	
	
	Customer addCustomer(Customer newCustomer)throws CustomerException;
	
	String deleteCustomerById(Integer id)throws CustomerException;
	
	Customer updateCustomer(Customer newCustomer)throws CustomerException;
	
	Customer getCustomerById(Integer id)throws CustomerException;
	
	Collection<Customer> getAllCustomers();
	
	Collection<Loan> getAllLoans();

}
