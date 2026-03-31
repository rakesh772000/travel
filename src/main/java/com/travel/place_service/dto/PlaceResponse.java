package com.travel.place_service.dto;

import lombok.*;

@Data
public class PlaceResponse {
    private Long id;
    private String name;
    private String city;
    private String category;
    private Double rating;
    private Double pricePerDay;
}
