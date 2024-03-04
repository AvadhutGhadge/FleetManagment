package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Airport;
import com.example.demo.services.AirportManager;


@RestController
public class AirportController 
{
	@Autowired
	private AirportManager airportManager;
	
	@GetMapping("/airport")
	public List<Airport> getAllAirport() 
	{
		 return airportManager.getAllAirport();
	}
	
	@GetMapping("/airport/{id}")
	public java.util.Optional<Airport> getAirportById(@PathVariable int id) {
		return airportManager.getAirportById(id);
	}
	
	
}
