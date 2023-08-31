package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;

import com.loan.loanapp.exception.CustomerException;




@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	LoansRepository loansRepo;

	@Override
	public Customer addCustomer(Customer newCustomer) throws CustomerException{
		 
		Optional<Customer> customerOpt = this.customerRepo.findById(newCustomer.getCustomerId());
	        if(customerOpt.isPresent())
	            throw new CustomerException("Customer already exist "+newCustomer.getCustomerName());
	        return this.customerRepo.save(newCustomer);
	}


    @Override
    public String deleteCustomerById(Integer id) throws CustomerException {
         Optional<Customer> customerOpt = this.customerRepo.findById(id);
         if(!customerOpt.isPresent())
             throw new CustomerException("Customer doesn't exist to delete for id: "+id);
         this.customerRepo.deleteById(id);
         return "Successfully deleted" ;
    }

	@Override
	public Customer updateCustomer(Customer newCustomer) throws CustomerException {
		Optional<Customer> customerOpt = this.customerRepo.findById(newCustomer.getCustomerId());
        if(!customerOpt.isPresent())
            throw new CustomerException("Customer doesn't exist to update ");
        return customerRepo.save(newCustomer);
   }

	@Override
	public Customer getCustomerById(Integer id) throws CustomerException {
		Optional<Customer> customerOpt = this.customerRepo.findById(id);
		if(!customerOpt.isPresent())
			throw new CustomerException("Customer doesn't exist for id: "+id);
		return customerOpt.get();
	}

//	@Override
//	public Collection<Customer> getAllCustomers() {
//		return this.customerRepo.findAll();
//	}
//
//	@Override
//	public Collection<Loan> getAllLoans() {
//		return this.loansRepo.findAll();
//	}
	
}