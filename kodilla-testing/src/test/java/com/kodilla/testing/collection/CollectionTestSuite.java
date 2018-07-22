package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit. *;
import java.util. *;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
     public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList());
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate((ArrayList<Integer>) numbers);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(result, Arrays.asList());
    }
    @Test
     public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate((ArrayList<Integer>) numbers);
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals(result, Arrays.asList(2,4,6,8,10,12));
    }
}
