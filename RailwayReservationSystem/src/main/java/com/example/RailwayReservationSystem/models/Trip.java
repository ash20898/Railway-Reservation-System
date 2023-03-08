package com.example.RailwayReservationSystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "Trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Number")
    private String Number;
    @Column(name = "Source")
    private String Source;
    @Column(name = "Destination")
    private String Destination;
    @Column(name = "Price")
    private int Price;
    @Column(name = "TrainId")
    private long TrainId;



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

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        this.Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public long getTrainId() {
        return TrainId;
    }

    public void setTrainId(long trainId) {
        TrainId = trainId;
    }

}
