package com.testdev.interview.dp.gof.behavior.visitor;

/**
 * Created by Taipan on 02.07.2015.
 */
public class VisitorApp {
    public static void main(String[] args) {
        Element element1 = new ConcreteElementA();
        Element element2 = new ConcreteElementB();
        Visitor visitor1 = new ConcreteVisitorA();
        Visitor visitor2 = new ConcreteVisitorB();
        element1.accept(visitor1);
        element1.accept(visitor2);
        element2.accept(visitor2);
    }
}
