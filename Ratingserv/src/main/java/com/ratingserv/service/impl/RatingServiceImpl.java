package com.ratingserv.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingserv.entities.Rating;
import com.ratingserv.repo.RatingRepo;
import com.ratingserv.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepo ratingRepo;

	@Override
	public Rating create(Rating rating) {
		String id = UUID.randomUUID().toString();
		rating.setRatingId(id);
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingsByUserId(String userId) {
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByHotelId(String hotelId) {
		return ratingRepo.findByHotelId(hotelId);
	}
	
	

}
