package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Document;
import com.loan.loanapp.exception.DocumentException;


public interface DocumentService {
	
	Document addDocument(Document newDocument)throws DocumentException;

	Document getDocumentById(Integer id)throws DocumentException;
	
	Document deleteDocument(Document document)throws DocumentException;

	Collection<Document> getAllDocument();
	
}
