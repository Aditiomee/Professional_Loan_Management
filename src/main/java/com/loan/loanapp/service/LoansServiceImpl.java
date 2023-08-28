package com.loan.loanapp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;

@Service
public class LoansServiceImpl implements LoansService{
	
	@Autowired
	LoansRepository loansRepo;


	@Override
	public Loan getLoansById(Integer id) throws LoansException {
		// TODO Auto-generated method stub
		Optional<Loan> loanopt=this.loansRepo.findById(id);
		if(loanopt.isEmpty())
			throw new LoansException("Loan not present"+id);
		return loanopt.get();	
	}

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return this.loansRepo.findAll();
	}

	@Override
	public Loan addLoan(Loan newLoan) throws LoansException {
		// TODO Auto-generated method stub
		Optional<Loan> loanOpt=this.loansRepo.findById(newLoan.getLoanId());
		if(loanOpt.isPresent())
			throw new LoansException("Loan already present "+newLoan.getLoanName());
		return this.loansRepo.save(newLoan);
	}

	@Override
	public String deleteLoanById(Integer id) throws LoansException {
		// TODO Auto-generated method stub
		Optional<Loan> loanOpt=this.loansRepo.findById(id);
		if(loanOpt.isEmpty())
			throw new LoansException("Loan not found to delete"+id);
		
		this.loansRepo.deleteById(id);
		return "Suceessfully deleted";
	
	}

	@Override
	public Loan updateLoan(Loan newLoan) throws LoansException {
		// TODO Auto-generated method stub
		Optional<Loan> loanOpt=this.loansRepo.findById(newLoan.getLoanId());
		if(loanOpt.isEmpty())
			throw new LoansException("Product not present "+newLoan.getLoanName());
		return this.loansRepo.save(newLoan);
	}

}
