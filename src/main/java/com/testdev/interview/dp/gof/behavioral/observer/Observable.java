package com.testdev.interview.dp.gof.behavioral.observer;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
