package com.codigorupestre.spacetravels.request;

import java.math.BigDecimal;

import com.codigorupestre.spacetravels.entity.Company;

import lombok.Data;


@Data
public class SpaceTravelRequest {

	private String origin;

	private String destination;

	private Company company;

	private BigDecimal price;

}
