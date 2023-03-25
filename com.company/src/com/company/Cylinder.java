package com.company;


        public class Cylinder extends Circle {
            double height;

            public Cylinder(String name, double radius, double height) {
                super(name, radius);
                this.height = height;
            }

            @Override
            double getVolume() {
                double volume = 3.14 * radius * radius * height;
                return volume;
            }
        }