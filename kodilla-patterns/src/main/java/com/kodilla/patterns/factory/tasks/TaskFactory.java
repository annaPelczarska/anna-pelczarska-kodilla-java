package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Grocery shopping","rotten tomatoes", 12);
            case PAINTING:
                return new PaintingTask("Outside painting", "turquoise","fence");
            case DRIVING:
                return new DrivingTask("Trippy trip", "over the rainbow", "LSD");
            default:
                return null;
        }

    }
}

