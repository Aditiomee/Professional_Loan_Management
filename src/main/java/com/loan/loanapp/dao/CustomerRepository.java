package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
