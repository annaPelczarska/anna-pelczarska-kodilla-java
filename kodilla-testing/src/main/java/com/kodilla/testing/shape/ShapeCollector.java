package com.kodilla.testing.shape;

import java.util. *;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = true;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = false;
        }
        return result;
    }
    public Shape getFigure(int n){
        Shape shape = null;
        if(n >= 0 && n< figures.size()){
            shape = figures.get(n);
        }
        return shape;

    }
    public List<Shape> showFigures(){
        return figures;
    }
}
