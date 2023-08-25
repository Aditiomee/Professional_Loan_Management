package com.loan.loanapp.service;



import com.loan.loanapp.exception.CollateralException;


public interface CollateralService  {
	
  CollateralService addCollateralService(CollateralService collateralService) throws CollateralException;

  CollateralService deleteCollateralServiceById(CollateralService collateralService) throws CollateralException;

  CollateralService getCollateralServiceById(CollateralService collateralService) throws CollateralException;

}
