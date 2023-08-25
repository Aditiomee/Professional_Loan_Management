package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
