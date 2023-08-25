package com.loan.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.dao.AdminRepository;
import com.loan.loanapp.dao.DocumentsRepository;
import com.loan.loanapp.service.DocumentService;

@RestController
public class DocumentController {
	@Autowired
	DocumentService documentService;
	
	


}
