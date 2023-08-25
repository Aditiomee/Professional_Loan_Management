package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.AppliedLoans;

public interface AppliedLoansRepository extends JpaRepository<AppliedLoans, Integer>{

}
