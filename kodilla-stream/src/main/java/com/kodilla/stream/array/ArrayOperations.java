package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, 20)
                .forEach(n -> System.out.println(numbers[n]));

        double average = IntStream.range(0, numbers.length)
                .mapToLong((index)->numbers[index])
                .average().orElse(0);

        return average;
    }
}
