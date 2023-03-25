package com.company;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();

    abstract double getVolume();
}
