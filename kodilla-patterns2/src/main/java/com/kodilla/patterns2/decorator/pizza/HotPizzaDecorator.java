package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HotPizzaDecorator extends AbstractPizzaDecorator {
    public HotPizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getContents() {
        return super.getContents()+" + chilli, jalapeno, chipotle";
    }
}
