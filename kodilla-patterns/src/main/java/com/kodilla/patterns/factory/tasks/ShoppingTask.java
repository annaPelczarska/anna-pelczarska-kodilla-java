package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private List<String> shoppingTaskNamesList = new ArrayList<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Buying " + whatToBuy + " in the following quantity: " + quantity);
        shoppingTaskNamesList.add(taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (shoppingTaskNamesList.contains(taskName)) {
            return true;
        } else {
            return false;
        }
    }
}
