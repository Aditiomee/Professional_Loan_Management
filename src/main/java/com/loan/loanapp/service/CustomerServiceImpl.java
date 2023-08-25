package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.CustomerException;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer addCustomer(Customer newCustomer) throws CustomerException{
		 
		Optional<Customer> productOpt = this.customerRepo.findById(newCustomer.getCustomerId());
	        if(productOpt.isPresent())
	            throw new CustomerException("Customer already exist "+newCustomer.getCustomerName());
	        return this.customerRepo.save(newCustomer);
	}
	


	@Override
	public Customer deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

}
