package com.testdev.interview.dp.gof.structural.proxy;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Proxy implements Subject {
    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void operation() {
        System.out.println("Added behavior");
        this.realSubject.operation();
    }
}
