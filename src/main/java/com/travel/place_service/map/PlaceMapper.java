package com.travel.place_service.map;
import com.travel.place_service.dto.PlaceRequest;
import com.travel.place_service.dto.PlaceResponse;
import com.travel.place_service.entity.Place;
import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {

    public Place toEntity(PlaceRequest request) {
        Place place = new Place();
        place.setName(request.getName());
        place.setCity(request.getCity());
        place.setCategory(request.getCategory());
        place.setRating(request.getRating());
        place.setPricePerDay(request.getPricePerDay());
        return place;
    }

    public PlaceResponse toResponse(Place entity) {
        PlaceResponse placeResponse=new PlaceResponse();
        placeResponse.setId(entity.getId());
        placeResponse.setName(entity.getName());
        placeResponse.setCity(entity.getCity());
        placeResponse.setCategory(entity.getCategory());
        placeResponse.setRating(entity.getRating());
        placeResponse.setPricePerDay(entity.getPricePerDay());
           return placeResponse;
    }
}
