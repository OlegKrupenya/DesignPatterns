package com.testdev.interview.dp.gof.behavioral.visitor;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteVisitorA implements Visitor {
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorA.visitConcreteElementA");
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitorA.visitConcreteElementB");
    }
}
