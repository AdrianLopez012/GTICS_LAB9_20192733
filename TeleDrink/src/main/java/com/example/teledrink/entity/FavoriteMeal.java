package com.example.teledrink.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "favorite_meals")
public class FavoriteMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "meal_id", nullable = false, length = 50)
    private String mealId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "category", length = 255)
    private String category;

    @Column(name = "area", length = 255)
    private String area;

    @Column(name = "instructions", columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "tags", length = 255)
    private String tags;

    @Column(name = "youtube", length = 255)
    private String youtube;

    @Column(name = "source", length = 255)
    private String source;

    @Column(name = "date_modified")
    private LocalDateTime dateModified;

}
