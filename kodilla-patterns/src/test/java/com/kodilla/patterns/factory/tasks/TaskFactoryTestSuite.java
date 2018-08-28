package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        shoppingTask.executeTask();
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Grocery shopping", shoppingTask.getTaskName());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask("PAINTING");
        //Then
        paintingTask.executeTask();
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Outside painting", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        drivingTask.executeTask();
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Trippy trip", drivingTask.getTaskName());
    }

}
