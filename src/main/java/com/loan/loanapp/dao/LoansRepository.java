package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Loan;

public interface LoansRepository extends JpaRepository<Loan, Integer>{

}
