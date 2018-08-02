package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        //ArrayOperations.getAverage();
        //When
        int numbers[]= {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        //Then
        Assert.assertEquals(5,ArrayOperations.getAverage(numbers),0.0001);

    }
}
