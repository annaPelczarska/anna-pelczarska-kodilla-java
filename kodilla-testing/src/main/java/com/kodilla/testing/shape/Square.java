package com.kodilla.testing.shape;

class Square implements Shape{

    String shapeName;
    double height;

    public Square(double height) {
        shapeName = "square";
        height = this.height;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return height*height;
    }



}





