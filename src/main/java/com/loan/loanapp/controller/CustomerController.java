package com.loan.loanapp.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.service.CustomerService;
import com.loan.loanapp.service.LoansService;




@RestController
public class CustomerController {
	@Autowired 
	CustomerService customerService;
	
	@Autowired
	LoansService loansService;
	
	
	
	@GetMapping("/")
	public String getGreeting() {
		return "welccome to our page";
		
	}
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer newCustomer) throws CustomerException {
                   
                    return this.customerService.addCustomer(newCustomer);
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
    
//    @GetMapping("/customers")
//	public Collection<Customer> getAllProducts() {
//		Collection<Customer> customerCollection = this.customerService.getAllCustomers();
//		return customerCollection;
//	}
//   
//    @GetMapping("/loans")
//   	public Collection<Loan> getAllLaons() {
//   		Collection<Loan> loanCollection = this.loansService.getAllLoans();
//   		return loanCollection;
//   	}
    
    



}
