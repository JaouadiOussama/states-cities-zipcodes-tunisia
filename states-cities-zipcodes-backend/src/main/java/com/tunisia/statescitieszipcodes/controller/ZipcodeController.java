package com.tunisia.statescitieszipcodes.controller;

import com.tunisia.statescitieszipcodes.domain.Zipcode;
import com.tunisia.statescitieszipcodes.repository.ZipcodeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ZipcodeController {

    private final ZipcodeRepository zipcodeRepository;


    public ZipcodeController(ZipcodeRepository zipcodeRepository) {
        this.zipcodeRepository = zipcodeRepository;
    }

    @GetMapping("/zipcodes/findByCityId/{cityId}")
    public ResponseEntity<List<Zipcode>> getZipCodesByCityId(@PathVariable Long cityId) {
        List<Zipcode> zipCodes = zipcodeRepository.findByCity_Id(cityId);
        return ResponseEntity.ok().body(zipCodes);
    }
}
