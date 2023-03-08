package com.example.RailwayReservationSystem.controller;

import com.example.RailwayReservationSystem.models.Booking;

import com.example.RailwayReservationSystem.service.BookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;


    @GetMapping("/Bookings")
    public String getAllBookings(Model model){
        List<Booking> AllBookings = bookingService.getAllBooking();
        model.addAttribute("AllBookings",AllBookings);
        return "AllBookings";
    }
    @GetMapping("/AllBookingsForNormalUsers")
    public String AllBookingsForNormalUsers(Model model){
        List<Booking> AllBookings = bookingService.getAllBooking();
        model.addAttribute("AllBookings",AllBookings);
        return "AllBookingsForNormalUsers";
    }
    @GetMapping("/ShowBookingForm")
    public String ShowBookingForm(Model model){
        Booking booking = new Booking();
        model.addAttribute("Booking",booking);
        return "ShowBookingForm";
    }

    @PostMapping("/AddBooking")
    public String AddBooking(@ModelAttribute("Booking") Booking booking){
        bookingService.addBooking(booking);
        return "redirect:/Bookings";
    }

    @GetMapping("/ShowUpdateBookingForm/{id}")
    public String ShowUpdateBookingForm(@PathVariable("id") long id , Model model){
        Booking booking = bookingService.getBookingById(id);
        model.addAttribute("Booking",booking);
        return "ShowUpdateBookingForm";
    }
    @PostMapping("/UpdateBooking/{id}")
    public String UpdateBooking(@PathVariable("id") long id,@ModelAttribute("Booking") Booking booking){
        bookingService.addBooking(booking);
        return "redirect:/Bookings";
    }

    @GetMapping("/DeleteBooking/{id}")
    public String DeleteBooking(@PathVariable("id") long id){
        bookingService.deleteTBookingById(id);
        return "redirect:/Bookings";
    }


}
