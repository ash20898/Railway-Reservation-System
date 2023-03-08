package com.example.RailwayReservationSystem.repository;

import com.example.RailwayReservationSystem.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {
}
