package com.kodilla.testing.shape;

public class Circle implements Shape {

    String shapeName;
    double radius;

    public Circle(double radius) {
        this.shapeName = "circle";
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return Math.PI*radius*radius;
    }

}
