package com.ratingserv.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingserv.entities.Rating;

public interface RatingRepo extends JpaRepository<Rating, String> {
	
	public List<Rating> findByUserId(String userId);
	public List<Rating> findByHotelId(String hotelId);

}
