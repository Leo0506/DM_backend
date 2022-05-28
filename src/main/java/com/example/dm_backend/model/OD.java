package com.example.dm_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;


@Entity
public class OD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    private int taxiId;

    private int startId;

    private LocalTime startTime;

    private double startLon;

    private double startLat;

    private int startSpeed;

    private double endId;

    private LocalTime endTime;

    public int getId() {
        return id;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public int getStartId() {
        return startId;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public double getStartLon() {
        return startLon;
    }

    public double getStartLat() {
        return startLat;
    }

    public int getStartSpeed() {
        return startSpeed;
    }

    public double getEndId() {
        return endId;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public double getEndLon() {
        return endLon;
    }

    public double getEndLat() {
        return endLat;
    }

    public int getEndSpeed() {
        return endSpeed;
    }

    private double endLon;

    private double endLat;

    private int endSpeed;

}
