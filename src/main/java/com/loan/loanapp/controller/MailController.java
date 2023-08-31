package com.loan.loanapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.loanapp.entity.Email;
import com.loan.loanapp.service.MailService;


@RestController
public class MailController {
	
	//@Autowired
	//ReminderRepository reminderRepo;
	
    MailService mailService;
    
    public MailController(MailService mailService) {
    	this.mailService=mailService;
    }
	
	@PostMapping("/send-email")
	public ResponseEntity sendEmail(@RequestBody Email emailMessage)
	{
		this.mailService.sendMail(emailMessage.getTo(),emailMessage.getSubject(), emailMessage.getMessage());
		return ResponseEntity.ok("Success");
	
		
	}
}