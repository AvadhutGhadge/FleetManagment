package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query(value = "SELECT COUNT(*) FROM Customer WHERE email = :email AND password = :password", nativeQuery = true)
    int login(@Param("email") String email, @Param("password") String password);
}
