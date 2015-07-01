package com.testdev.interview.dp.gof.creational.builder.domain;

import com.testdev.interview.dp.gof.creational.factory.method.domain.Warrior;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Infantryman implements Warrior {
    @Override
    public void info() {
        System.out.println("Infantryman");
    }
}
