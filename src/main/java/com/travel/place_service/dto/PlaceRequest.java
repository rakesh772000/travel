package com.travel.place_service.dto;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PlaceRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "Category is required")
    private String category;

    @DecimalMin(value = "0.0", message = "Rating must be >= 0")
    @DecimalMax(value = "5.0", message = "Rating must be <= 5")
    private Double rating;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private Double pricePerDay;
}