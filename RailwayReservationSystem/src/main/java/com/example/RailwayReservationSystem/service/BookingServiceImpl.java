package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Booking;
import com.example.RailwayReservationSystem.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(long id) {
        return bookingRepository.findById(id).get();
    }

    @Override
    public void addBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public void deleteTBookingById(long id) {
        bookingRepository.deleteById(id);
    }
}
