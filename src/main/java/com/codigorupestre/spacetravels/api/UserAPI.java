package com.codigorupestre.spacetravels.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigorupestre.spacetravels.request.UserRequest;
import com.codigorupestre.spacetravels.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserAPI {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody UserRequest request){
		
		service.createUser(request);
		
		return new ResponseEntity<>("Usuario creado", HttpStatus.CREATED);
	}

}
