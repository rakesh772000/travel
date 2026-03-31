package com.travel.place_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "places")
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String category;
    private Double rating;
    private Double pricePerDay;
}