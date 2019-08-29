package com.cy.repository;

import java.util.List;

import com.cy.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;


public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long>{
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
