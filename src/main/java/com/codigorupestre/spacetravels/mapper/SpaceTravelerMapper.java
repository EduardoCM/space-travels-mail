package com.codigorupestre.spacetravels.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.codigorupestre.spacetravels.entity.SpaceTravelerEntity;
import com.codigorupestre.spacetravels.request.SpaceTravelerRequest;
import com.codigorupestre.spacetravels.response.SpaceTravelerResponse;

@Mapper(componentModel = "spring")
public interface SpaceTravelerMapper {

	SpaceTravelerMapper INSTANCE = Mappers.getMapper(SpaceTravelerMapper.class);

	@Mapping(target = "id", ignore = true)
	SpaceTravelerEntity mapperUser(SpaceTravelerRequest user);
	
	
	SpaceTravelerResponse mapperUserRequest(SpaceTravelerEntity userEntity);

}
