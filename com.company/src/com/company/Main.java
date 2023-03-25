package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shape shape = null;
        double len = 0;
        double height = 0;
        System.out.print("Enter Choice:- ");
        int ch;
        do {
            System.out.print("\n1.Circle" + "\n2.Square" + "\n3.Cube" + "\n4.Cylinder " + "\n5.Sphere" + "\n6.Glome" + "\nEnter your choice : ");
            ch = Integer.parseInt(br.readLine());
            if (ch > 7) {
                System.out.println("Invalid Choice");
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter radius of circle:");
                    len = Double.parseDouble(br.readLine());
                    shape = new Circle("circle", len);
                    System.out.println("Area = " + shape.getArea());
                    break;
                case 2:
                    System.out.print("Enter side of Square:");
                    len = Double.parseDouble(br.readLine());
                    shape = new Square("square", len);
                    System.out.println("Area = " + shape.getArea());
                    break;
                case 3:
                    System.out.print("Enter side of cube:");
                    len = Double.parseDouble(br.readLine());
                    shape = new Cube("cube", len);
                    System.out.println("Volume = " + shape.getVolume());
                    break;
                case 4:
                    System.out.print("Enter radius of cylinder:");
                    len = Double.parseDouble(br.readLine());
                    System.out.print("Enter height of cylinder:");

                    height = Double.parseDouble(br.readLine());
                    shape = new Cylinder("cylinder", len, height);
                    System.out.println("Volume = " + shape.getVolume());
                    break;
                case 5:
                    System.out.print("Enter radius of sphere:");
                    len = Double.parseDouble(br.readLine());
                    shape = new Sphere("sphere", len);
                    System.out.println("Volume = " + shape.getVolume());
                    break;
                case 6:
                    System.out.print("Enter radius of Glome:");
                    len = Double.parseDouble(br.readLine());
                    shape = new Glome("Glome", len);
                    System.out.println("Volume = " + shape.getVolume());
                    break;
                case 7:
                    System.exit(0);
            }
        } while (ch != 7);
    }
}