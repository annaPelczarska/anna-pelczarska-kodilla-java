package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheesyPizzaDecorator extends AbstractPizzaDecorator {
    public CheesyPizzaDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getContents() {
        return super.getContents()+" & cheddar, mozzarella, parmesan, blue cheese";
    }
}
