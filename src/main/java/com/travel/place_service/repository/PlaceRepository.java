package com.travel.place_service.repository;

import com.travel.place_service.dto.PlaceResponse;
import com.travel.place_service.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place,Long> {
        List<Place> findByNameContainingIgnoreCase(String name);
}
