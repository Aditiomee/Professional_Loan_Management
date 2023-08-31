package com.loan.loanapp.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapp.entity.Document;
import com.loan.loanapp.entity.DocumentType;

public interface DocumentsRepository extends JpaRepository<Document, Integer>{
	
	Optional<Document> findByDocumentType(DocumentType documentType);

}
