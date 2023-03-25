package com.company;

public class Sphere extends Circle {
    public Sphere(String name, double radius) {
        super(name, radius);
    }

    @Override
    double getVolume() {
        double volume = 4 * 3.14 * Math.pow(radius, 3) / 3;
        return volume;
    }
}