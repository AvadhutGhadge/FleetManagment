package com.example.demo.services;

import com.example.demo.entities.Booking;
import com.example.demo.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {


    @Autowired
    private BookingRepository bookingrepository;

    @Override
    public void save(Booking booking) {
        bookingrepository.save(booking);
    }

    @Override
    public Booking getBookingByEmailId(String emailId) {
        return bookingrepository.getBookingByEmailId(emailId);
    }
}
