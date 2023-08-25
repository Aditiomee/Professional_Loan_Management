package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
