package com.loan.loanapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Collateral;

public interface CollateralRepository extends JpaRepository<Collateral, Integer>{

}
