package com.loan.loanapp.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Document {
	
	@Id
	private Integer documentId;
	private DocumentType documentType;
	private LocalDate documentSubmissionDate;
	private String documentStatus;
	

	public Document() {
		super();
	}

	

	public Document(Integer documentId, DocumentType documentType, LocalDate documentSubmissionDate,
			String documentStatus) {
		super();
		this.documentId = documentId;
		this.documentType = documentType;
		this.documentSubmissionDate = documentSubmissionDate;
		this.documentStatus = documentStatus;
	}



	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public LocalDate getDocumentSubmissionDate() {
		return documentSubmissionDate;
	}

	public void setDocumentSubmissionDate(LocalDate documentSubmissionDate) {
		this.documentSubmissionDate = documentSubmissionDate;
	}

	public String getDocumentStatus() {
		return documentStatus;
	}

	public void setDocumentStatus(String documentStatus) {
		this.documentStatus = documentStatus;
	}

	
}
