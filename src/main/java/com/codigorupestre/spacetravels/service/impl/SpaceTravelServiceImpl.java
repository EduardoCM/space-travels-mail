package com.codigorupestre.spacetravels.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigorupestre.spacetravels.entity.SpaceTravelEntity;
import com.codigorupestre.spacetravels.repository.SpaceTravelRepository;
import com.codigorupestre.spacetravels.request.SpaceTravelRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelResponse;
import com.codigorupestre.spacetravels.service.SpaceTravelService;

@Service
public class SpaceTravelServiceImpl implements SpaceTravelService {
	
	@Autowired
	private SpaceTravelRepository repository;

	@Override
	public SpaceTravelResponse create(SpaceTravelRequest spaceTravelRequest) {
		SpaceTravelEntity entity = new SpaceTravelEntity();
		BeanUtils.copyProperties(spaceTravelRequest, entity);
		
		SpaceTravelEntity crateEntity = repository.save(entity);
		
		var response = new SpaceTravelResponse();
		BeanUtils.copyProperties(crateEntity, response);
		
		return response;
	}
	
	
	

}
