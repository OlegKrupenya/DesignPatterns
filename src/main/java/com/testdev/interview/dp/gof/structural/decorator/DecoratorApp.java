package com.testdev.interview.dp.gof.structural.decorator;

/**
 * Adds behavior or state to individual objects at run-time
 * Created by oleh.krupenia on 7/1/2015.
 */
public class DecoratorApp {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator1(component);
        decorator.operation();
    }
}
