package com.testdev.interview.dp.gof.behavioral.visitor;

/**
 * Defines a new operation to a class without change
 * Created by Taipan on 01.07.2015.
 */
public interface Visitor {
    void visitConcreteElementA(
            ConcreteElementA concreteElementA);
    void visitConcreteElementB(
            ConcreteElementB concreteElementB);
}
