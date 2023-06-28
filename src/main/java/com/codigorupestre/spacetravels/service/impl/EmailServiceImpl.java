package com.codigorupestre.spacetravels.service.impl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.codigorupestre.spacetravels.request.SpaceTravelerRequest;
import com.codigorupestre.spacetravels.service.EmailService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Service
public class EmailServiceImpl implements EmailService {

	private final JavaMailSender mailSender;
	
	@Override
	public void sendMail(SpaceTravelerRequest user) {
		
		MimeMessage message = mailSender.createMimeMessage();
		
		try {
			
			message.setFrom(new InternetAddress("ecm3198@gmail.com"));
			message.setRecipients(MimeMessage.RecipientType.TO, user.getEmail());
		    message.setContent(getHTML(user), "text/html; charset=utf-8");
		    message.setSubject("Confirmation of my account to SpaceTravels site");
		    mailSender.send(message);
		
		} catch (AddressException e) {
			log.error(e.getMessage(), e);
		} catch (MessagingException e) {
			log.error(e.getMessage(), e);
		}
		
		
	}
	
	
	private String getHTML(SpaceTravelerRequest user) {
		String htmlEmail = null;
		try {
			var lines = Files.lines(Paths.get("src/main/resources/mail/WelcomeUser.html"));
			var html = lines.collect(Collectors.joining());		
			htmlEmail = html.replace("{{fullName}}", user.getFullName()).replace("{{planet}}", user.getPlanet());
		}catch(Exception e) {
		   log.info(e.getMessage(), e);	
		}		
		return htmlEmail;
	}
	

}
