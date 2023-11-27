package org.example;

import java.util.ArrayList;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    ArrayList<BusStop> busStops = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<BusStop> getBusStops() {
        return busStops;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBusStops(ArrayList<BusStop> busStops) {
        this.busStops = busStops;
    }
}
