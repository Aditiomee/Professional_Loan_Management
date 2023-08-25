package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
