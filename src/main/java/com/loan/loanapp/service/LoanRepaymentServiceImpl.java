package com.loan.loanapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.loanapp.dao.LoanRepaymentRepository;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.LoanRepayment;
import com.loan.loanapp.exception.CustomerException;
import com.loan.loanapp.exception.LoanRepaymentException;


@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService {
	
	@Autowired
	LoanRepaymentRepository loanRepaymentRepo;

	@Override
	public LoanRepayment getLoanRepaymentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanRepayment addRepayment(LoanRepayment newRepayment) throws LoanRepaymentException {
		// TODO Auto-generated method stub
		Optional<LoanRepayment> repaymentOpt = this.loanRepaymentRepo.findById(newRepayment.getLoanRepaymentId());
        if(repaymentOpt.isPresent())
            throw new LoanRepaymentException("Repayment Done "+newRepayment.getRepaymentRecipt());
        return this.loanRepaymentRepo.save(newRepayment);
	}

}
