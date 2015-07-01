package com.testdev.interview.dp.gof.structural.proxy;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RealSubject implements Subject {
    @Override
    public void operation() {
        System.out.println("RealSubject.operation");
    }
}
