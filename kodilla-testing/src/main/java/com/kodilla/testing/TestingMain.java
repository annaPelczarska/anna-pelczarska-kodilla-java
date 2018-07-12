package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();

        int addresult = calculator.addAToB(6,2);
        int subresult = calculator.substractBFromA(6,2);

        if (addresult ==(6+2)){
            System.out.println("add test OK");
        } else {
            System.out.println("Error in add!");
        }

        if (subresult ==(6-2)){
            System.out.println("sub test OK");
        } else {
            System.out.println("Error in sub!");
        }

        }
    }
