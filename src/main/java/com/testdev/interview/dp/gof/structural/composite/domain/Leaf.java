package com.testdev.interview.dp.gof.structural.composite.domain;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf.operation");
    }
}
