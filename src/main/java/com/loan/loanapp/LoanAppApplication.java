package com.loan.loanapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.loan.loanapp.service.MailService;

@SpringBootApplication
public class LoanAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppApplication.class, args);
	}
	
	@Autowired
	MailService mailService;
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		mailService.sendMail("Aditiomee@gmail.com", "hello", "hello");
	}

}
