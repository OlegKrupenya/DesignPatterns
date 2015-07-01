package com.testdev.interview.dp.gof.behavior.visitor;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
