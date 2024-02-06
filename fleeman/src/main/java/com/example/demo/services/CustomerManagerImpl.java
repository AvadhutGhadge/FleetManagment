package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repositories.CustomerRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;



@Service
public class CustomerManagerImpl implements CustomerManager{
	@Autowired
	private CustomerRepository c_repository;
	

	@Override
	public void addCourse(Customer customer) {
		// TODO Auto-generated method stub
		c_repository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return c_repository.findAll();
	}

	@Override
	public boolean login(String email, String password) {
		 int count = c_repository.login(email, password);
	        return count > 0;
	}

	
	

}
