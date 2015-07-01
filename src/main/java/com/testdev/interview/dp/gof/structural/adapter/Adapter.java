package com.testdev.interview.dp.gof.structural.adapter;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
