package com.tunisia.statescitieszipcodes.repository;

import com.tunisia.statescitieszipcodes.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByState_Id(Long stateId);

}
