package com.me.hotel.service.services;

import java.util.List;

import com.me.hotel.service.entity.Hotel;

public interface HotelService {

	//create
	
	Hotel createHotel(Hotel hotel);
	
	//get
	
	Hotel getHotel(String hotelId);
	
	//getall
	List<Hotel> getAllHotels();
	
}
