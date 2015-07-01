package com.testdev.interview.dp.gof.structural.decorator;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent.operation");
    }
}
