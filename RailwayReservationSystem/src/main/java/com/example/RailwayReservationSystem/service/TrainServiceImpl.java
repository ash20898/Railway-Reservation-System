package com.example.RailwayReservationSystem.service;

import com.example.RailwayReservationSystem.models.Train;
import com.example.RailwayReservationSystem.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService{
    @Autowired
    private TrainRepository trainRepository;
    @Override
    public List<Train> getAllTrains() {
        return  trainRepository.findAll();
    }

    @Override
    public Train getTrainById(long id) {
        return trainRepository.findById(id).get();
    }

    @Override
    public void addTrain(Train train) {
        trainRepository.save(train);
    }

    @Override
    public void deleteTrainById(long id) {
        trainRepository.deleteById(id);
    }
}
