package com.codigorupestre.spacetravels.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacetravels.request.SpaceTravelerRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelerResponse;
import com.codigorupestre.spacetravels.service.SpaceTravelerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class SpaceTravelerAPI {

	@Autowired
	private SpaceTravelerService service;

	@PostMapping
	public ResponseEntity<?> create(@RequestBody SpaceTravelerRequest request) {
		
		log.info("Space Traveler request {} ", request);

		SpaceTravelerResponse userCreated = service.createSpaceTraveler(request);
		
		log.info("Space Traveler created {} ", userCreated);

		return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
	}

}
