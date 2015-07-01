package com.testdev.interview.dp.gof.structural.composite.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public void removeComponent(Component component) {
        this.components.remove(component);
    }
}
