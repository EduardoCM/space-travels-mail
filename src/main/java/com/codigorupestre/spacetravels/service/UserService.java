package com.codigorupestre.spacetravels.service;

import com.codigorupestre.spacetravels.request.UserRequest;
import com.codigorupestre.spacetravels.response.UserResponse;

public interface UserService {

	public UserResponse createUser(UserRequest userRequest);

}
