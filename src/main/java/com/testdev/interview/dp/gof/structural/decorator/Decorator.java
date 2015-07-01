package com.testdev.interview.dp.gof.structural.decorator;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
