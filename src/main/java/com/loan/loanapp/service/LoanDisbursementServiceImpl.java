package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoanDisbursementRepository;
import com.loan.loanapp.entity.LoanDisbursement;
import com.loan.loanapp.exception.LoanDisbursementException;


@Service
public class LoanDisbursementServiceImpl implements LoanDisbursementService{
	
	@Autowired
	LoanDisbursementRepository loanDisbursementRepo;

	@Override
    public Double getLoanDisbursementAmountById (Integer id) throws LoanDisbursementException {
         Optional<LoanDisbursement> loanDisbursementOpt =this.loanDisbursementRepo.findById(id);
         if(!loanDisbursementOpt.isPresent())
             throw new LoanDisbursementException("LoanDisbursement amount doesn't exist for id: "+id);
         return loanDisbursementOpt.get().getLoanDisbursementAmount();
    }
	
	
	
	@Override
	public LoanDisbursement addLoanDisbursement(LoanDisbursement newLoanDisbursement) throws LoanDisbursementException {
		// TODO Auto-generated method stub
		Optional<LoanDisbursement> loanDisbursementOpt = this.loanDisbursementRepo.findById(newLoanDisbursement.getLoanDisbursementId());
			if(loanDisbursementOpt.isPresent())
				throw new LoanDisbursementException("Already added");
		return this.loanDisbursementRepo.save(newLoanDisbursement);
	}
		

	@Override
	public Collection<LoanDisbursement> geLoanDisbursements() {
		// TODO Auto-generated method stub
		 return this.loanDisbursementRepo.findAll();
	}
	
	

}
