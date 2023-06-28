package com.codigorupestre.spacetravels.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.spacetravels.entity.SpaceTravelerEntity;
import com.codigorupestre.spacetravels.mapper.SpaceTravelerMapper;
import com.codigorupestre.spacetravels.repository.SpaceTravelerRepository;
import com.codigorupestre.spacetravels.request.SpaceTravelerRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelerResponse;
import com.codigorupestre.spacetravels.service.EmailService;
import com.codigorupestre.spacetravels.service.SpaceTravelerService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class SpaceTravelerImpl implements SpaceTravelerService {

	@Autowired
	private EmailService emailService;
	
	@Autowired
	private SpaceTravelerRepository repository;
	
	@Autowired
	private SpaceTravelerMapper mapper;
	
	@Override
	public SpaceTravelerResponse createSpaceTraveler(SpaceTravelerRequest userRequest) {
		
		SpaceTravelerEntity userEntity = mapper.mapperUser(userRequest);
		
		repository.save(userEntity);
	
		log.info("Registrando usuario");
		emailService.sendMail(userRequest);
		log.info("Correo enviado de forma exitosa");
		
		return mapper.mapperUserRequest(userEntity);
	}
	
	
	

}
