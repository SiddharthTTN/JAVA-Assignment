package com.test;

public class Triangle {
    private int altitude;
    private int base;

    public Triangle() {

    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
//        System.out.println("Setter of altitude running");
        this.altitude = altitude;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Triangle(int altitude, int base) {
        this.altitude = altitude;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "altitude=" + altitude +
                ", base=" + base +
                '}';
    }
}
