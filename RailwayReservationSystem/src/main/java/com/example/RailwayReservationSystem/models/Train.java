package com.example.RailwayReservationSystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Trains")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Number")
    private String Number;
    @Column(name = "Line")
    private String Line;

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

    public String getLine() {
        return Line;
    }

    public void setLine(String line) {
        Line = line;
    }
}
