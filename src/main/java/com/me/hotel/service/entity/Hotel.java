package com.me.hotel.service.entity;

import com.me.hotel.service.util.Constant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = Constant.HOTELS)
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String location;
	private String about;

}
