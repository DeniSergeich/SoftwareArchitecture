package org.example;

public class BusStop {
    private int id;
    private String name;
    private double attitude;
    private double latitude;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double[] getCoordinates(){
        return new double[]{this.attitude, this.latitude};
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(double attitude, double latitude){
        this.latitude = latitude;
        this.attitude = attitude;
    }
}
