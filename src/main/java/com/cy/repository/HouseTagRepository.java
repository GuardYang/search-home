package com.cy.repository;

import java.util.List;

import com.cy.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;


public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
