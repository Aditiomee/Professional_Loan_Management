package com.loan.loanapp.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.loan.loanapp.dao.LoansRepository;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.exception.LoansException;
import com.loan.loanapp.service.LoansService;



@RestController
public class LoansController {
	@Autowired
	LoansService loansService;
	
	@Autowired
	LoansRepository loansRepo;
	
	@PostMapping("/loan")
    public Loan addLoan(@RequestBody Loan newLoan) {
                   
                    return this.loansRepo.save(newLoan);
                   
    }
	 @GetMapping("/loan/{id}")
     public Loan getCustomerById(@PathVariable Integer id) {
                     return this.loansRepo.findById(id).get();
                    
     }
	
	 @DeleteMapping("/loan/{id}/")
		public ResponseEntity<Loan> deleteProduct(@PathVariable("id") Integer id) throws LoansException {
			//return this.productService.deleteProduct(id);
			this.loansService.deleteLoanById(id);
			return new ResponseEntity<Loan>(HttpStatus.OK);
			
		}
	 @PutMapping("/loan/")//http:/localhost:8090/
		public ResponseEntity<Loan> replaceLoan(@RequestBody Loan newLoan) throws LoansException {
			this.loansService.updateLoan(newLoan);
			//return this.productService.getProductById(newProduct.getId());
			return new ResponseEntity<Loan>(newLoan,HttpStatus.OK);
		}

}
	

