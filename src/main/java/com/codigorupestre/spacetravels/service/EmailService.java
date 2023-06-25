package com.codigorupestre.spacetravels.service;

import com.codigorupestre.spacetravels.request.UserRequest;

public interface EmailService {
	
	
	public void sendMail(UserRequest user);
}
