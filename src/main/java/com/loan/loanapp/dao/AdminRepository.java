package com.loan.loanapp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Admin;
import com.loan.loanapp.entity.Document;
import com.loan.loanapp.entity.DocumentType;
import com.loan.loanapp.entity.Loan;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
}
