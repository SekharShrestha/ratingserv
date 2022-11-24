package com.ratingserv.service;

import java.util.List;

import com.ratingserv.entities.Rating;

public interface RatingService {
	
	public Rating create(Rating rating);
	public List<Rating> getRatings();
	public List<Rating> getRatingsByUserId(String usserId);
	public List<Rating> getRatingsByHotelId(String hotelId);

}
