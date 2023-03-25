package com.company;

public class Square extends Shape {
    double side;
    String name;

    public Square(String name, double side) {
        super(name);
        this.side = side;
        this.name = name;
    }

    public double getSide() {
        return side;
    }

    @Override
    double getArea() {
        double area = side * side;
        return area;
    }

    @Override
    double getVolume() {
        return 0;
    }
}