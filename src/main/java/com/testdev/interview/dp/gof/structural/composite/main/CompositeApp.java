package com.testdev.interview.dp.gof.structural.composite.main;

import com.testdev.interview.dp.gof.structural.composite.domain.Component;
import com.testdev.interview.dp.gof.structural.composite.domain.Composite;
import com.testdev.interview.dp.gof.structural.composite.domain.Leaf;

/**
 *  The composite pattern describes that a group of objects is to be treated in the same way as a single instance of an object
 * Created by oleh.krupenia on 7/1/2015.
 */
public class CompositeApp {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        Component leaf4 = new Leaf();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite1.addComponent(leaf1);
        composite2.addComponent(leaf2);
        composite2.addComponent(leaf3);
        composite2.addComponent(leaf4);
        composite2.addComponent(composite1);
        composite2.operation();
    }
}
