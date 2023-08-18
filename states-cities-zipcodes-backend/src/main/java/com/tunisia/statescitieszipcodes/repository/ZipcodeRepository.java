package com.tunisia.statescitieszipcodes.repository;

import com.tunisia.statescitieszipcodes.domain.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipcodeRepository extends JpaRepository<Zipcode, Long> {
    List<Zipcode> findByCity_Id(Long cityId);

}

