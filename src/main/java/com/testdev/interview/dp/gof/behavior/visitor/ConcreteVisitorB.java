package com.testdev.interview.dp.gof.behavior.visitor;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteVisitorB implements Visitor {
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteVisitorB.visitConcreteElementA");
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteVisitorB.visitConcreteElementB");
    }
}
