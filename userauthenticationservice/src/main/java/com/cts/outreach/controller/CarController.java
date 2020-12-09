package com.cts.outreach.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.outreach.model.Car;
import com.cts.outreach.service.CarService;

@RestController
@RequestMapping(value="/api/car")
public class CarController {
	
	@Autowired
	CarService carService;
	
	@GetMapping("/list")
	public List<Car> getAll() {
		return carService.findCar();
	}
	
	@GetMapping("/nameandprice/{name}/{price}")
	public List<Car> getCar(@PathVariable String name, @PathVariable Integer price){
		Optional<List<Car>> findCarByNameAndPrice = carService.findCarByNameAndPrice(name, price);
		if(findCarByNameAndPrice.isPresent())
			return findCarByNameAndPrice.get();
		else
			return new ArrayList<Car>();
	}

}
