package com.testdev.interview.dp.gof.structural.bridge;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction() {
    }

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        this.implementor.operation();
    }
}
