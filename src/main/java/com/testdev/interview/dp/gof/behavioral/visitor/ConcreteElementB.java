package com.testdev.interview.dp.gof.behavioral.visitor;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}
