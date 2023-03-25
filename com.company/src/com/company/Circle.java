package com.company;

public class Circle extends Shape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    @Override
    double getVolume() {
        return 0;
    }
}
