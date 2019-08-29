package com.cy.repository;

import java.util.List;

import com.cy.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;


public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}
