package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.restaurant.dto.FoodItemDTO;
import com.restaurant.dto.RestaurantDTO;
import com.restaurant.entity.FoodItem;
import com.restaurant.entity.Restaurant;
import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.repository.FoodItemRepository;
import com.restaurant.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private FoodItemRepository foodItemRepository;

    // Add Restaurant
    public Restaurant addRestaurant(RestaurantDTO dto) {

        Restaurant restaurant = new Restaurant();
        restaurant.setName(dto.getName());
        restaurant.setLocation(dto.getLocation());
        restaurant.setRating(dto.getRating());

        return restaurantRepository.save(restaurant);
    }

    // Get Restaurants with Pagination
    public Page<Restaurant> getRestaurants(int page, int size) {
        return restaurantRepository.findAll(PageRequest.of(page, size));
    }

    // Add Food Item
    public FoodItem addFoodItem(Long restaurantId, FoodItemDTO dto) {

        Restaurant restaurant = restaurantRepository.findById(restaurantId)
        		.orElseThrow(() -> new ResourceNotFoundException("Restaurant not found"));

        FoodItem foodItem = new FoodItem();
        foodItem.setName(dto.getName());
        foodItem.setPrice(dto.getPrice());
        foodItem.setCategory(dto.getCategory());
        foodItem.setRestaurant(restaurant);

        return foodItemRepository.save(foodItem);
    }

    // Get Food Items by Restaurant
    public List<FoodItem> getFoodItemsByRestaurant(Long restaurantId) {

        Restaurant restaurant = restaurantRepository.findById(restaurantId)
        		.orElseThrow(() -> new ResourceNotFoundException("Restaurant not found"));
        return foodItemRepository.findAll()
                .stream()
                .filter(f -> f.getRestaurant().getId().equals(restaurant.getId()))
                .toList();
    }
}