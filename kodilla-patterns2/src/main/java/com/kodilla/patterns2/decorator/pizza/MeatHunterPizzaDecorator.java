package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatHunterPizzaDecorator extends AbstractPizzaDecorator {
    public MeatHunterPizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(22));
    }

    @Override
    public String getContents() {
        return super.getContents()+" & ham, salami, pepperoni, minced beef";
    }
}
