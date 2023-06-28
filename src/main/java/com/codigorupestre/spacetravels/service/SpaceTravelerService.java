package com.codigorupestre.spacetravels.service;

import com.codigorupestre.spacetravels.request.SpaceTravelerRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelerResponse;

public interface SpaceTravelerService {

	public SpaceTravelerResponse createSpaceTraveler(SpaceTravelerRequest userRequest);

}
