package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.CollateralRepository;
import com.loan.loanapp.entity.Collateral;
import com.loan.loanapp.exception.CollateralException;

@Service
public class CollateralServiceImpl implements CollateralService {
	
	@Autowired
	CollateralRepository collateralRepo;

	@Override
	public CollateralService addCollateral(Collateral newCollateral) throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollateralService deleteCollateralById(Integer id) throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollateralService getCollateralById(Integer id) throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

	


}
