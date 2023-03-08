package com.example.RailwayReservationSystem.controller;

import com.example.RailwayReservationSystem.models.Train;
import com.example.RailwayReservationSystem.models.Trip;
import com.example.RailwayReservationSystem.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TrainController {
    @Autowired
    private TrainService trainService;


    @GetMapping("/Trains")
    public String getAllTrains(Model model){
        List<Train> AllTrains = trainService.getAllTrains();
        model.addAttribute("AllTrains",AllTrains);
        return "AllTrains";
    }
    @GetMapping("/AllTrainsForNormalUsers")
    public String getAllTrainsForNormalUsers(Model model){
        List<Train> AllTrains = trainService.getAllTrains();
        model.addAttribute("AllTrains",AllTrains);
        return "AllTrainsForNormalUsers";
    }
    @GetMapping("/ShowTrainForm")
    public String ShowTrainForm(Model model){
        Train train = new Train();
        model.addAttribute("Train",train);
        return "ShowTrainForm";
    }

    @PostMapping("/AddTrain")
    public String AddTrain(@ModelAttribute("Train") Train train){
        trainService.addTrain(train);
        return "redirect:/Trains";
    }

    @GetMapping("/ShowUpdateTrainForm/{id}")
    public String ShowUpdateTrainForm(@PathVariable("id") long id , Model model){
        Train train = trainService.getTrainById(id);
        model.addAttribute("Train",train);
        return "ShowUpdateTrainForm";
    }
    @PostMapping("/UpdateTrain/{id}")
    public String UpdateTrain(@PathVariable("id") long id,@ModelAttribute("Train") Train train){
        trainService.addTrain(train);
        return "redirect:/Trains";
    }

    @GetMapping("/DeleteTrain/{id}")
    public String DeleteTrain(@PathVariable("id") long id){
        trainService.deleteTrainById(id);
        return "redirect:/Trains";
    }


}
