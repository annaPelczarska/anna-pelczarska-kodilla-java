package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private List<String> drivingTaskNamesList = new ArrayList<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving to " + where + " by " + using);
        drivingTaskNamesList.add(taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (drivingTaskNamesList.contains(taskName)) {
            return true;
        } else {
            return false;
        }
    }
}
