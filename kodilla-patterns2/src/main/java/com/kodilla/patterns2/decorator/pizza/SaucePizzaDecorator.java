package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SaucePizzaDecorator extends AbstractPizzaDecorator {
    public SaucePizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getContents() {
        return super.getContents()+" + additional sauce";
    }
}
