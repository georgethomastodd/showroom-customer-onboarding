package com.camunda.demo.insuranceapplication.adapter;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailService {

	public void sendEmail(String toEmail, String mailtext, String subject) throws EmailException {
	    Email email = new SimpleEmail();
	    email.setHostName("mail.camunda.com");
	    email.setAuthentication("demo@mx.camunda.com", "28484234386345");
	    email.setFrom("demo@camunda.com");
	    email.setCharset("utf-8");
	    email.setSubject(subject);
	    email.setMsg(mailtext);
	    email.addTo(toEmail);
	    email.send();
	  }
	
	
}
