package com.loan.loanapp.service;



import com.loan.loanapp.entity.Collateral;
import com.loan.loanapp.exception.CollateralException;


public interface CollateralService  {
	
  CollateralService addCollateral(Collateral newCollateral) throws CollateralException;

  CollateralService deleteCollateralById(Integer id) throws CollateralException;

  CollateralService getCollateralById(Integer id) throws CollateralException;

}
