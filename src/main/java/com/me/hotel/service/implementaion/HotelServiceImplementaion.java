package com.me.hotel.service.implementaion;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.hotel.service.entity.Hotel;
import com.me.hotel.service.exceptions.ResourceNotFoundException;
import com.me.hotel.service.repository.HotelRepository;
import com.me.hotel.service.services.HotelService;

@Service
public class HotelServiceImplementaion implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotel(String hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).orElseThrow(() -> new 
				ResourceNotFoundException("hotel with given id not found" + hotelId));
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return hotelRepository.findAll();
	}

}
