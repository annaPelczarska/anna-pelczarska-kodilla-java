package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double val){
        System.out.println("The result of the complex computation is the following: "+val);
    }
}
