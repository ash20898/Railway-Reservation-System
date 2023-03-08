package com.example.RailwayReservationSystem.repository;

import com.example.RailwayReservationSystem.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long> {
}
