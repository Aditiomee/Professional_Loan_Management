package com.loan.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.CollateralRepository;
import com.loan.loanapp.exception.CollateralException;

@Service
public class CollateralServiceImpl implements CollateralService {
	
	@Autowired
	CollateralRepository collateralRepo;

	@Override
	public CollateralService addCollateralService(CollateralService collateralService) throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollateralService deleteCollateralServiceById(CollateralService collateralService)
			throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollateralService getCollateralServiceById(CollateralService collateralService) throws CollateralException {
		// TODO Auto-generated method stub
		return null;
	}

}
