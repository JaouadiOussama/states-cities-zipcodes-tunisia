package com.tunisia.statescitieszipcodes.controller;

import com.tunisia.statescitieszipcodes.domain.City;
import com.tunisia.statescitieszipcodes.repository.CityRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CityController {

    private final CityRepository cityRepository;


    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/cities/findByStateId/{stateId}")
    public ResponseEntity<List<City>> getCitiesByStateId(@PathVariable Long stateId) {
        List<City> cities = cityRepository.findByState_Id(stateId);
        return ResponseEntity.ok().body(cities);
    }
}
