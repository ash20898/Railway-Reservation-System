package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Booking;
import com.example.RailwayReservationSystem.models.Train;

import java.util.List;

public interface BookingService {

    public List<Booking> getAllBooking();
    public Booking getBookingById(long id);
    public void addBooking(Booking booking);
    public void deleteTBookingById(long id);
}
