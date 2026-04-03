package com.travel.place_service.service;

import com.travel.place_service.dto.PlaceRequest;
import com.travel.place_service.dto.PlaceResponse;
import com.travel.place_service.entity.Place;
import com.travel.place_service.map.PlaceMapper;
import com.travel.place_service.repository.PlaceRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;
    private  final PlaceMapper mapper;


    public PlaceService(PlaceRepository placeRepository, PlaceMapper mapper) {
        this.placeRepository = placeRepository;
        this.mapper = mapper;
    }

    @CacheEvict(value = "places", allEntries = true)
    public PlaceResponse create(PlaceRequest request){
        Place entity = mapper.toEntity(request);
        placeRepository.save(entity);
        return mapper.toResponse(entity);
    }

    @Cacheable(value = "places")
    public List<PlaceResponse> getAllPlaces(){
      return placeRepository.findAll()
              .stream()
              .map(mapper::toResponse)
              .toList();
    }

    @Cacheable(value = "places", key = "#name")
    public List<PlaceResponse> getByPlaceName(String name) {
        List<Place> places = placeRepository.findByNameContainingIgnoreCase(name);

        return places.stream()
                .map(mapper::toResponse)
                .toList();
    }
}
