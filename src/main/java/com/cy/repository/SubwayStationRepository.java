package com.cy.repository;

import java.util.List;

import com.cy.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;


public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
