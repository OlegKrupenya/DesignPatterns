package com.testdev.interview.dp.gof.structural.adapter;

/**
 * Converts the interface of a class into another interface clients expect
 * Created by oleh.krupenia on 7/1/2015.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}
