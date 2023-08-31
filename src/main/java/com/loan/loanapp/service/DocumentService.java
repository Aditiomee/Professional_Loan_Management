package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Document;
import com.loan.loanapp.exception.DocumentException;


public interface DocumentService {
	
	Document addDocument(Document newDocument)throws DocumentException;

	Document getDocumentById(Integer id)throws DocumentException;
	
	String deleteDocumentById(Integer id)throws DocumentException;

	Collection<Document> getAllDocument();
	
}
