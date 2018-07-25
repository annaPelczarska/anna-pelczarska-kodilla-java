package com.kodilla.testing.shape;

import org.junit.*;
import java.util.Arrays;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        Shape aSquare = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(aSquare);
        Assert.assertFalse(shapeCollector.showFigures().isEmpty());
    }
    @Test
    public void testRemoveFigure() {
        Shape aSquare = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(aSquare);
        boolean result = shapeCollector.removeFigure(aSquare);
        Assert.assertEquals(result,shapeCollector.showFigures().contains(aSquare));
    }
    @Test
    public void testRemoveFigureNotExisting() {
        Shape aSquare = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        boolean result = shapeCollector.removeFigure(aSquare);
        Assert.assertTrue(result);
    }
    @Test
    public void testGetFigure() {
        Shape aSquare = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(aSquare);
        Shape retrievedShape = shapeCollector.getFigure(0);
        Assert.assertEquals(aSquare,retrievedShape);
    }
    @Test
    public void testShowFigures(){
        Shape aSquare = new Square(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(aSquare);
        Assert.assertEquals(Arrays.asList(aSquare),shapeCollector.showFigures());
    }

}
