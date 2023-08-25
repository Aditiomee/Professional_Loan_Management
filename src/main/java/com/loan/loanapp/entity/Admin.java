package com.loan.loanapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Admin {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AdminId;
	private String AdminName;
	private String AdminUsername;
	private String Password;
	private String AdminEmail;
	private Integer AdminPhoneNo;
	
	
	@OneToMany
	private List<Loan> loans = new ArrayList<Loan>();
	@OneToOne
	private Bank bank;

	
	public Integer getAdminId() {
		return AdminId;
	}


	public void setAdminId(Integer adminId) {
		AdminId = adminId;
	}


	public String getAdminName() {
		return AdminName;
	}


	public void setAdminName(String adminName) {
		AdminName = adminName;
	}


	public String getAdminUsername() {
		return AdminUsername;
	}


	public void setAdminUsername(String adminUsername) {
		AdminUsername = adminUsername;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getAdminEmail() {
		return AdminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}


	public Integer getAdminPhoneNo() {
		return AdminPhoneNo;
	}


	public void setAdminPhoneNo(Integer adminPhoneNo) {
		AdminPhoneNo = adminPhoneNo;
	}


	public List<Loan> getLoans() {
		return loans;
	}


	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}

	

	public Admin(Integer adminId, String adminName, String adminUsername, String password, String adminEmail,
			Integer adminPhoneNo, List<Loan> loans, Bank bank) {
		super();
		AdminId = adminId;
		AdminName = adminName;
		AdminUsername = adminUsername;
		Password = password;
		AdminEmail = adminEmail;
		AdminPhoneNo = adminPhoneNo;
		this.loans = loans;
		this.bank = bank;
	}


	public Admin() {
		super();
	}
	
	
	
	
	
	
	
}
