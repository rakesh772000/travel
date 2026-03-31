package com.travel.place_service.controller;

import com.travel.place_service.dto.PlaceRequest;
import com.travel.place_service.dto.PlaceResponse;
import com.travel.place_service.service.PlaceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/place")
public class PlaceController {
    private final PlaceService service;

    public PlaceController(PlaceService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<PlaceResponse> create(@Valid @RequestBody PlaceRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<PlaceResponse>> getAll() {
        return ResponseEntity.ok(service.getAllPlaces());
    }

}
