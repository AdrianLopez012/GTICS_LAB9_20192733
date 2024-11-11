package com.example.teledrink.repository;

import com.example.teledrink.entity.FavoriteMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FavoriteMealRepository extends JpaRepository<FavoriteMeal, Long> {
    Optional<FavoriteMeal> findByMealId(String mealId);
}
