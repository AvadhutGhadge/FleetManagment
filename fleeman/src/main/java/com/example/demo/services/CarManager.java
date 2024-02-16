package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Car;

public interface CarManager 
{
	Optional<Car> getCarByHub(long hub_id);
	public void UpdateAvailable(long carId);
	List<Car> getCarByHubAndCategory(long hub_id, long CarType_ID);
}
