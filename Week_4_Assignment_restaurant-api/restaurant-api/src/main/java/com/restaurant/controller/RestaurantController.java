package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.restaurant.dto.FoodItemDTO;
import com.restaurant.dto.RestaurantDTO;
import com.restaurant.entity.FoodItem;
import com.restaurant.entity.Restaurant;
import com.restaurant.service.RestaurantService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // Get All Restaurants with Pagination
    @GetMapping
    public Page<Restaurant> getRestaurants(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        return restaurantService.getRestaurants(page, size);
    }

    // Add Restaurant
    @PostMapping
    public Restaurant addRestaurant(@Valid @RequestBody RestaurantDTO dto) {
        return restaurantService.addRestaurant(dto);
    }

    // Add Food Item to Restaurant
    @PostMapping("/{restaurantId}/fooditems")
    public FoodItem addFoodItem(@PathVariable Long restaurantId,
                                @Valid @RequestBody FoodItemDTO dto) {

        return restaurantService.addFoodItem(restaurantId, dto);
    }

    // Get Food Items by Restaurant
    @GetMapping("/{restaurantId}/fooditems")
    public List<FoodItem> getFoodItems(@PathVariable Long restaurantId) {
        return restaurantService.getFoodItemsByRestaurant(restaurantId);
    }
}