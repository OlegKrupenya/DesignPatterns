package com.testdev.interview.dp.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class ConcreteObservable implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }
}
