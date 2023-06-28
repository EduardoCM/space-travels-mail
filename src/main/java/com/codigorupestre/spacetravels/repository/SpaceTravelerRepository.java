package com.codigorupestre.spacetravels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigorupestre.spacetravels.entity.SpaceTravelEntity;
import com.codigorupestre.spacetravels.entity.SpaceTravelerEntity;

public interface SpaceTravelerRepository extends JpaRepository<SpaceTravelerEntity, Long> {

}
