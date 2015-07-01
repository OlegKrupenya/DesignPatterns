package com.testdev.interview.dp.gof.structural.bridge;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementor1.operation");
    }
}
