package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Trip;

import java.util.List;

public interface TripService {

    public List<Trip> getAllTrips();
    public Trip getTripById(long id);
    public void addTrip(Trip trip);
    public void deleteTripById(long id);
}
