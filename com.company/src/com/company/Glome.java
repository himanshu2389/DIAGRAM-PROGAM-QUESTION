package com.company;

public class Glome extends Circle {
    public Glome(String name, double radius) {
        super(name, radius);
    }

    @Override
    double getVolume() {
        double volume = 0.5 * 3.14 * 3.14 * radius * radius * radius * radius;
        return volume;
    }
}