package com.ratingserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingserv.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {

}
