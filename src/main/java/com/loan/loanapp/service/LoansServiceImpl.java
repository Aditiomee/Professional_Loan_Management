package com.loan.loanapp.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.dto.LoanCalculatorDto;
import com.loan.loanapp.dto.LoanCalculatorResultDto;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Service
public class LoansServiceImpl implements LoansService{
	
	@Autowired
	LoansRepository loansRepo;


	@Override
	public Loan getLoansById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanCalculatorResultDto calculateLoan(LoanCalculatorDto loanCalculatorDto) {
		  double monthlyInterestRate = loanCalculatorDto.getAnnualInterestRate() / 12;
	        int numberOfPayments = loanCalculatorDto.getLoanTermInYears() * 12;

	        double monthlyPayment = (monthlyInterestRate * loanCalculatorDto.getLoanAmount()) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
	        double totalAmountPaid = monthlyPayment * numberOfPayments;
	        double totalInterestPaid = totalAmountPaid - loanCalculatorDto.getLoanAmount();

	        return new LoanCalculatorResultDto(monthlyPayment, totalAmountPaid, totalInterestPaid);
	    }
	
	@Override
    public Loan updateLoanStatus(Integer id) throws LoansException {
         java.util.Optional<Loan> loansOpt = this.loansRepo.findById(id);
         Loan loan  = loansOpt.get();
         String status = "Approved";
         loan.setStatus(status);
         return this.loansRepo.save(loan);
	}
}
