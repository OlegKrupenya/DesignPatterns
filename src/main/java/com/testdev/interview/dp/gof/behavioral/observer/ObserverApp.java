package com.testdev.interview.dp.gof.behavioral.observer;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class ObserverApp {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observable observable = new ConcreteObservable();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObservers();
    }
}
