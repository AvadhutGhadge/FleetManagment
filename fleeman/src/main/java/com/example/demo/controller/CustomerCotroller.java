package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerManager;





@RestController
public class CustomerCotroller {
	@Autowired
	private CustomerManager c_manager;
	
	@GetMapping("/")
	public List<Customer> getAllCourses()
	{
		return c_manager.getAllCustomers();
	}
	
	@PostMapping("/customer")
	public void addCourse(@RequestBody Customer customer)
	{
		c_manager.addCourse(customer);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/login/{email}/{password}")
    public boolean login(@PathVariable String email,@PathVariable String password)
	{
		return c_manager.login(email, password);
	}
}
