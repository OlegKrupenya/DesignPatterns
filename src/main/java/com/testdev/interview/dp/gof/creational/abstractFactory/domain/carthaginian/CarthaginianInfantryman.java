package com.testdev.interview.dp.gof.creational.abstractFactory.domain.carthaginian;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Infantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class CarthaginianInfantryman implements Infantryman {
    @Override
    public void info() {
        System.out.println("CarthaginianInfantryman");
    }
}
