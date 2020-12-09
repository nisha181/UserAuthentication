package com.cts.outreach.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.outreach.model.Car;
import com.cts.outreach.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	
	public List<Car> findCar(){
		return carRepository.findAll();
	}
	
	public Optional<List<Car>> findCarByNameAndPrice(String name, int price){
		
		Optional<List<Car>> findByCarNameAndPrice = carRepository.findByCarNameAndPrice(name,price);
		return findByCarNameAndPrice;
	}

}
