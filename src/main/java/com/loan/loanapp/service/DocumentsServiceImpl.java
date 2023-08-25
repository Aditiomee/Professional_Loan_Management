package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.DocumentsRepository;
import com.loan.loanapp.entity.Document;
import com.loan.loanapp.exception.DocumentException;


@Service
public class DocumentsServiceImpl implements DocumentService {
	
	@Autowired
	DocumentsRepository documentsRepo;

	@Override
	public Document getDocumentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Document> getAllDocument() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document addDocument(Document newDocument) throws DocumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document deleteDocument(Document document) throws DocumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
