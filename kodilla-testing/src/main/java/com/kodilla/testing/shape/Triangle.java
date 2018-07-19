package com.kodilla.testing.shape;

public class Triangle implements Shape {

        String shapeName;
        double height;
        double base;

        public Triangle(String shapeName, double height, double base) {
            shapeName = this.shapeName;
            height = this.height;
            base = this.base;
        }

        public String getShapeName() {
            return shapeName;
        }


        public double getField() {
            return 0.5*height*base;
        }

}
