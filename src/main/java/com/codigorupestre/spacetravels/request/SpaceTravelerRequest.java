package com.codigorupestre.spacetravels.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class SpaceTravelerRequest implements Serializable {
	
	private static final long serialVersionUID = -16455926274239985L;
	
	private String fullName;
	
	private String email;
	
	private String planet;
	
	private String country;
	
	private boolean active;
	
	

}
