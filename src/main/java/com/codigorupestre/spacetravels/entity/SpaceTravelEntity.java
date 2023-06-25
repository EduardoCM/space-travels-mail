package com.codigorupestre.spacetravels.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "SpaceTravel")
public class SpaceTravelEntity implements Serializable {

	private static final long serialVersionUID = 1319272803584155263L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String origin;
	
	private String destination;
	
	private Company company;
	
	private BigDecimal price;
	
	

	
	
}
