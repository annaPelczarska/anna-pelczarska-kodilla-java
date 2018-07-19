package com.kodilla.testing.shape;

class Square implements Shape{

    String shapeName;
    double height;

    public Square(String shapeName, double height) {
        shapeName = this.shapeName;
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





