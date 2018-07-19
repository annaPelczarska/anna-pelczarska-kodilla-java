package com.kodilla.testing.shape;

import java.util. *;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        //do nothing
    }
    public boolean removeFigure(Shape shape){
        return true;
    }
    public Shape getFigure(int n){
        return null;

    }
    public List<Shape> showFigures(){
        return figures;
    }
}
