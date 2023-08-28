package com.loan.loanapp;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loan.loanapp.dao.CustomerRepository;
import com.loan.loanapp.entity.Address;
import com.loan.loanapp.entity.Customer;
import com.loan.loanapp.entity.Document;
import com.loan.loanapp.entity.Loan;
import com.loan.loanapp.entity.LoanRepayment;
import com.loan.loanapp.service.CustomerService;

@SpringBootApplication
public class LoanAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LoanAppApplication.class, args);
	}
	@Autowired
	CustomerRepository customerRepo;

	//LocalDate today = LocalDate.parse("2019-03-29");

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Customer customer=new Customer(1, "Rana", "ranashaik@gmail.com", "1234", 98900,"2003-08-25", "Indian","Female", 23, 0, 100000, 750, new Address(1, "304", "abc", "camp","camp","pune",3220));
		
		/*Customer(Integer customerId, String customerName, String customerEmail, String customerPassword,
				Integer customerPhoneNo, LocalDate customerDob, String customerNationality, String customerGender,
				Integer customerAge, Integer workexperience, Double customerIncome, Integer customerCreditScore,
				Address address, List<Loan> loans, List<Document> documents, List<LoanRepayment> loanrepayment)*/
		//Customer customer1 = new Customer(1, "Rana", "ranashaik@gmail.com", "1234",98900,LocalDate.parse("2019-03-29"), "Indian","Female", 23, 0, (double) 100000, 750,null,null,null,null);
		//Customer customer=new Customer(2,"Shruti","shruti@gmail.com","12345",null,null,"indian","Female",20,1,100000,750,null,null,null,null);
		//System.out.println("Like: "+this.customerRepo.findByCustomerEmail(email));
		Customer c1=new Customer(2, "Shruti", "shruti@gmail.com", "12345");
		Customer c3=new Customer(3, "Rifat", "rifat@gmail.com", "4321");
		Customer c2=new Customer(4, "Aditi", "aditi@gmail.com", "12345");
		Customer c4=new Customer(5, "pqr", "pqr@gmail.com", "12345");
		//System.out.println(this.customerRepo.save(c4));
		//System.out.println("JPQL"+this.customerRepo.findByCustomerEmail(c1.getCustomerEmail()));
		//System.out.println(c1.getCustomerEmail());
		
	}

}
