package com.codigorupestre.spacetravels.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.spacetravels.request.UserRequest;
import com.codigorupestre.spacetravels.response.UserResponse;
import com.codigorupestre.spacetravels.service.EmailService;
import com.codigorupestre.spacetravels.service.UserService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private EmailService emailService;
	
	@Override
	public UserResponse createUser(UserRequest userRequest) {
	
		log.info("Registrando usuario");
		emailService.sendMail(userRequest);
		log.info("Correo enviado de forma exitosa");
		
		return null;
	}
	
	
	

}
