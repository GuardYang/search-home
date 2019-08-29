package com.cy.repository;

import java.util.List;

import com.cy.entity.Subway;
import org.springframework.data.repository.CrudRepository;

public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
