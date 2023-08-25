package com.loan.loanapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Document {
	
	@Id
	private Integer documentId;
	private String documentName;
	private LocalDate documentSubmissionDate;
	private String documentStatus;
	public Integer getDocumentId() {
		return documentId;
	}
	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
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
	public Document(Integer documentId, String documentName, LocalDate documentSubmissionDate, String documentStatus) {
		super();
		this.documentId = documentId;
		this.documentName = documentName;
		this.documentSubmissionDate = documentSubmissionDate;
		this.documentStatus = documentStatus;
	}
	public Document() {
		super();
	}
	
	
	
	
}
