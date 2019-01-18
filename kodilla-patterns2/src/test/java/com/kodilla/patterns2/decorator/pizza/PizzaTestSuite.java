package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {
    @Test
    public void testBasicPizzaGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculatedCost);
    }
    @Test
    public void testBasicPizzaGetContents(){
        //Given
        Pizza thePizza = new BasicPizza();
        //When
        String contents = thePizza.getContents();
        //Then
        assertEquals("Your pizza consists of plain dough, tomato sauce, cheese",contents);
    }
    @Test
    public void testHotMeatHunterPizzaGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new MeatHunterPizzaDecorator(thePizza);
        thePizza = new HotPizzaDecorator(thePizza);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(43),calculatedCost);
    }
    @Test
    public void testHotMeatHunterPizzaGetContents(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new MeatHunterPizzaDecorator(thePizza);
        thePizza = new HotPizzaDecorator(thePizza);
        //When
        String contents = thePizza.getContents();
        //Then
        assertEquals("Your pizza consists of plain dough, tomato sauce, cheese & ham, salami, pepperoni, minced beef + chilli, jalapeno, chipotle",contents);
    }
    @Test
    public void testCheesyVegPizzaWithSauceGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new CheesyPizzaDecorator(thePizza);
        thePizza = new VegPizzaDecorator(thePizza);
        thePizza = new SaucePizzaDecorator(thePizza);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(48),calculatedCost);
    }
    @Test
    public void testCheesyVegPizzaWithSauceGetContents(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new CheesyPizzaDecorator(thePizza);
        thePizza = new VegPizzaDecorator(thePizza);
        thePizza = new SaucePizzaDecorator(thePizza);
        //When
        String contents = thePizza.getContents();
        //Then
        assertEquals("Your pizza consists of plain dough, tomato sauce, cheese & cheddar, mozzarella, parmesan, blue cheese + tomatoes, arugula, mushrooms, sweet peppers + additional sauce",contents);
    }

}