package com.testdev.interview.dp.gof.behavioral.observer;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("Event has been handled in" + this.toString());
    }
}
