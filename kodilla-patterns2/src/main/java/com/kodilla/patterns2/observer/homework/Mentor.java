package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer {
    private final String firstName;
    private final String secondName;
    private int updateCount;

    public Mentor(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("Mentor "+firstName+ " " +secondName + ": New submission in queue: " + homeworkQueue.getQueueName() + "\n" +
                " (total: " + homeworkQueue.getHomeworks().size() + " submission(s)");
        updateCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
