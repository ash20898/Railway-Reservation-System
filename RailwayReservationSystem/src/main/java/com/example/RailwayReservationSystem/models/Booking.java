package com.example.RailwayReservationSystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Number")
    private String Number;
    @Column(name = "User Id")
    private long UserId;
    @Column(name = "Trip Id")
    private long TripId;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getTripId() {
        return TripId;
    }

    public void setTripId(long tripId) {
        TripId = tripId;
    }
}
