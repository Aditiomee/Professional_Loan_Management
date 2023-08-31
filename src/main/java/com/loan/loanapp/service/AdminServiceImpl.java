package com.loan.loanapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.loan.loanapp.dao.AppliedLoansRepository;
import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.dao.DocumentsRepository;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.AppliedLoans;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.entity.Document;

import com.loan.loanapp.entity.DocumentType;
import com.loan.loanapp.exception.AppliedLoansException;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.exception.LoansException;


//@Component
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	LoansRepository loansRepo;
	
	@Autowired
	DocumentsRepository documentsRepo;

	@Autowired
	CustomerRepository customerRepo;
	@Override
	public Loan approveLoan(Loan loan, Customer customer) throws LoansException {
		   
		        if (areValidDocuments(loan) && isValidCreditScore(customer)) {
		        	Optional<Loan> loanOpt = this.loansRepo.findById(loan.getLoanId());
		        	   if (loanOpt.isPresent()) {
		                   Loan existingLoan = loanOpt.get();
		                   existingLoan.setStatus("Approved");
		                   return this.loansRepo.save(existingLoan);
		               } else {
		                   // Handle the case when the loan is not found
		                   throw new LoansException("Loan not found");
		               }
		           } else {
		               loan.setStatus("Rejected");
		               return this.loansRepo.save(loan);
		           }
		       }

		    private boolean areValidDocuments(Loan loan) {
		    	// Assuming AppliedLoans has a List<Document> field representing the submitted documents

		    	List<Document> submittedDocuments = loan.getDocument();
		    	
		    	boolean hasAllRequiredDocuments = checkRequiredDocuments(submittedDocuments);
		    	
		        return hasAllRequiredDocuments;
		    }

		    private boolean checkRequiredDocuments(List<Document> submittedDocuments) {
		    	// List of required document types
		        List<DocumentType> requiredDocumentTypes =  Arrays.asList(
		        		
		       DocumentType.AADHAR,
		       DocumentType.PAN,
		       DocumentType.INCOME,
		       DocumentType.DEGREE,
		       DocumentType.ADDRESS
		            
		        );

		        for (DocumentType requiredType : requiredDocumentTypes) {
		            boolean hasRequiredType = false;
		            for (Document submittedDoc : submittedDocuments) {
		                if (submittedDoc.getDocumentType() == requiredType) {
		                    hasRequiredType = true;
		                    break;
		                }
		            }
		            if (!hasRequiredType) {
		                return false; // Required document type is missing
		            }
		        }

		        return true; // All required documents are present
		    }

			private boolean isValidCreditScore(Customer customer) {
				Integer requiredCreditScore = 670; 
				Optional<Customer> customerOpt = this.customerRepo.findById(customer.getCustomerId());
				
			    Integer customerCreditScore = customerOpt.get().getCustomerCreditScore();
		         return customerCreditScore >= requiredCreditScore;
		    }
		


	@Override
	public Loan viewLoanById(Integer id) throws LoansException {
		Optional<Loan> loanOpt = this.loansRepo.findById(id);
		if(!loanOpt.isPresent())
			throw new LoansException("Loan doesn't exist for id: "+id);
		return loanOpt.get();
	}


	@Override
	public Collection<Loan> getPendingLoans() throws LoansException {
		
		   List<Loan> pendingLoans = new ArrayList<>();

		    try {
		        // Assuming you have a method to fetch loans from your data source
		        List<Loan> allLoans = this.loansRepo.findAll();

		        // Filter pending loans based on their status
		        for (Loan loan : allLoans) {
		            if ("pending".equalsIgnoreCase(loan.getStatus())) {
		                pendingLoans.add(loan);
		            }
		        }
		    } catch (Exception e) {
		        throw new LoansException("Error fetching pending loans"+ e);
		    }

		    return pendingLoans;
		}
	
	@Override
	public Collection<Loan> getApprovedLoans() throws LoansException {
		   List<Loan> approvedLoans = new ArrayList<>();

		    try {
		        // Assuming you have a method to fetch loans from your data source
		        List<Loan> allLoans = this.loansRepo.findAll();

		        // Filter pending loans based on their status
		        for (Loan loan : allLoans) {
		            if ("approved".equalsIgnoreCase(loan.getStatus())) {
		               approvedLoans.add(loan);
		            }
		        }
		    } catch (Exception e) {
		        throw new LoansException("Error fetching pending loans"+ e);
		    }

		    return approvedLoans;
		}

	@Override
	public Collection<Loan> getAllLoans() throws LoansException {
		// TODO Auto-generated method stub
		return this.loansRepo.findAll();
	}

//	@Override
//	public Loan moveApprovedLoansToLoanDisbursement() throws LoansException {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

	


}
