package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegPizzaDecorator extends AbstractPizzaDecorator {
    public VegPizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getContents() {
        return super.getContents()+" + tomatoes, arugula, mushrooms, sweet peppers";
    }
}
