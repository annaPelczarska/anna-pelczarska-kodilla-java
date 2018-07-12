package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    // List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
    //List<Integer> evenNumbers = new ArrayList<>();

    public ArrayList exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
            return evenNumbers;

    }
}