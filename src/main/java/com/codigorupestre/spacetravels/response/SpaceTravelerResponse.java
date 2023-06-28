package com.codigorupestre.spacetravels.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class SpaceTravelerResponse implements Serializable {

	private static final long serialVersionUID = 2985356575279370110L;

	private Long id;

	private String fullName;

	private String email;

	private String planet;

	private String country;

	private boolean active;

}
