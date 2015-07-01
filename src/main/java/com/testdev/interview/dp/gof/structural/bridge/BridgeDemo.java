package com.testdev.interview.dp.gof.structural.bridge;

/**
 * Decouples abstraction from implementation, so they can vary independently
 * Created by oleh.krupenia on 7/1/2015.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Implementor implementor1 = new ConcreteImplementor1();
        Implementor implementor2 = new ConcreteImplementor2();
        Abstraction abstraction = new RefinedAbstraction(implementor1);
        abstraction.operation();
        abstraction.setImplementor(implementor2);
        abstraction.operation();
    }
}
