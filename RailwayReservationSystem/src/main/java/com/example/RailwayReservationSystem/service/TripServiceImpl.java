package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Trip;
import com.example.RailwayReservationSystem.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService{

    @Autowired
    private TripRepository tripRepository;
    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getTripById(long id) {
        return tripRepository.findById(id).get();
    }

    @Override
    public void addTrip(Trip trip) {
        tripRepository.save(trip);
    }

    @Override
    public void deleteTripById(long id) {
        tripRepository.deleteById(id);
    }
}
