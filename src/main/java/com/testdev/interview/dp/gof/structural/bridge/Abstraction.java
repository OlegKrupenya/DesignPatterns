package com.testdev.interview.dp.gof.structural.bridge;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Abstraction {
    protected Implementor implementor;

    public Abstraction() {
    }

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operation();
    }
}
