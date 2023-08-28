package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import om.loan.loanapp.dto.Login
import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;

import com.loan.loanapp.exception.CustomerException;


import com.loan.loanapp.exception.CustomerException;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	


	@Override
	public Customer addCustomer(Customer newCustomer) throws CustomerException {

		Optional<Customer> productOpt = this.customerRepo.findById(newCustomer.getCustomerId());
		if (productOpt.isPresent())
			throw new CustomerException("Customer already exist " + newCustomer.getCustomerName());
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String encodedPassword=passwordEncoder.encode(newCustomer.getCustomerPassword());
		newCustomer.setCustomerPassword(encodedPassword);
		return this.customerRepo.save(newCustomer);
	


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

	@Override
	public Collection<Customer> getAllCustomers() {
		return this.customerRepo.findAll();
	}

	@Override

	public Boolean validateCustomer(Login loginDetailsDto) throws CustomerException {

		String email1 = loginDetailsDto.getCustomerEmail();
		String password1 = loginDetailsDto.getCustomerPassword();
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		Optional<Customer> opCustomer=customerRepo.findByCustomerEmail(email1);
		//Optional<Customer> opCustomerP=customerRepo.findByCustomerPassword(password1);
		if(opCustomer.isPresent()) {
			Customer dbCustomer=opCustomer.get();
			//if(loginDetailsDto.getCustomerPassword().equals(dbCustomer.getCustomerPassword()))
			if(passwordEncoder.matches(loginDetailsDto.getCustomerPassword(), dbCustomer.getCustomerPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
		throw new CustomerException("Customer not found with this email");
		

	}
	
}