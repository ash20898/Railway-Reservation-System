package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Train;
import com.example.RailwayReservationSystem.models.Trip;

import java.util.List;

public interface TrainService {

    public List<Train> getAllTrains();
    public Train getTrainById(long id);
    public void addTrain(Train train);
    public void deleteTrainById(long id);
}
