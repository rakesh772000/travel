package com.travel.place_service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlaceResponse implements Serializable {
    private Long id;
    private String name;
    private String city;
    private String category;
    private Double rating;
    private Double pricePerDay;
}
