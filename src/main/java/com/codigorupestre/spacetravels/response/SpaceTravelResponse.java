package com.codigorupestre.spacetravels.response;

import java.math.BigDecimal;

import com.codigorupestre.spacetravels.entity.Company;

import lombok.Data;

@Data
public class SpaceTravelResponse {

	private Long id;

	private String origin;

	private String destination;

	private Company company;

	private BigDecimal price;

}
