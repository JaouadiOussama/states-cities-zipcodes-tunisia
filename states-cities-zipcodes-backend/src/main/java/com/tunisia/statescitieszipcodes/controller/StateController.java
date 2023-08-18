package com.tunisia.statescitieszipcodes.controller;

import com.tunisia.statescitieszipcodes.domain.State;
import com.tunisia.statescitieszipcodes.repository.StateRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StateController {

    private final StateRepository stateRepository;

    public StateController(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @GetMapping("/states")
    public ResponseEntity<List<State>> getAllStates() {
        List<State> states = stateRepository.findAll();
        return ResponseEntity.ok().body(states);
    }
}
