package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private List<String> paintingTaskNamesList = new ArrayList<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting " + whatToPaint + " " + color);
        paintingTaskNamesList.add(taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (paintingTaskNamesList.contains(taskName)) {
            return true;
        } else return false;
    }
}
