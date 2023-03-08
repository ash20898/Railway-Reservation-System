package com.example.RailwayReservationSystem.controller;

import com.example.RailwayReservationSystem.models.Trip;
import com.example.RailwayReservationSystem.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/Trips")
    public String getAllTrips(Model model){
        List<Trip> AllTrips = tripService.getAllTrips();
        model.addAttribute("AllTrips",AllTrips);
        return "AllTrips";
    }
    @GetMapping("/AllTripsForNormalUsers")
    public String AllTripsForNormalUsers(Model model){
        List<Trip> AllTrips = tripService.getAllTrips();
        model.addAttribute("AllTrips",AllTrips);
        return "AllTripsForNormalUsers";
    }
    @GetMapping("/ShowTripForm")
    public String ShowTripForm(Model model){
        Trip trip = new Trip();
        model.addAttribute("Trip",trip);
        return "ShowTripForm";
    }

    @PostMapping("/AddTrip")
    public String AddTrip(@ModelAttribute("Trip") Trip trip){
        tripService.addTrip(trip);
        return "redirect:/Trips";
    }

    @GetMapping("/ShowUpdateTripForm/{id}")
    public String ShowUpdateTripForm(@PathVariable("id") long id , Model model){
        Trip trip = tripService.getTripById(id);
        model.addAttribute("Trip",trip);
        return "TripUpdateForm";
    }
    @PostMapping("/UpdateTrip/{id}")
    public String UpdateTrip(@PathVariable("id") long id,@ModelAttribute("Trip") Trip trip){
        tripService.addTrip(trip);
        return "redirect:/Trips";
    }

    @GetMapping("/DeleteTrip/{id}")
    public String DeleteTrip(@PathVariable("id") long id){
        tripService.deleteTripById(id);
        return "redirect:/Trips";
    }


}
