package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String queueName;

    public HomeworkQueue(String queueName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.queueName = queueName;
    }

    public void submitHomwork(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getQueueName() {
        return queueName;
    }

}
