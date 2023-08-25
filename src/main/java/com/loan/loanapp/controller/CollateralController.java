package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.service.CollateralService;

@RestController
public class CollateralController {
	
	@Autowired
	CollateralService collateralService;

}
