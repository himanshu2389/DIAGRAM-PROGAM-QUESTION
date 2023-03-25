package com.company;

public class Cube extends Square {
    public Cube(String name, double side) {
        super(name, side);
    }

    @Override
    double getVolume() {
        double volume = side * side * side;
        return volume;
    }
}