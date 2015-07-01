package com.testdev.interview.dp.gof.structural.decorator;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("AddedBehavior in ConcreteDecorator1");
    }
}
