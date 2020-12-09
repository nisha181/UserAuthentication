package com.cts.outreach.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.outreach.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	
	public Optional<List<Car>> findByCarNameAndPrice(String name, int price);

}
