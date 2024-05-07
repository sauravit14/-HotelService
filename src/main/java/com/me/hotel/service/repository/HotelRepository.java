package com.me.hotel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.hotel.service.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
