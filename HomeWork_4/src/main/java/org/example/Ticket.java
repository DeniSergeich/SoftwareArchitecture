package org.example;

import java.text.DateFormat;
import java.util.Date;

public class Ticket {
    private float price;
    private Date date = new Date();
    private int startZone;
    private int finishZone;
    private double isLuggage;
    private int place;
    private int roadNumber;

    public float getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public double getIsLuggage() {
        return isLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }
}
