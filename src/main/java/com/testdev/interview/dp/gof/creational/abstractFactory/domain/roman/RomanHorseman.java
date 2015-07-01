package com.testdev.interview.dp.gof.creational.abstractFactory.domain.roman;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Horseman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RomanHorseman implements Horseman {
    @Override
    public void info() {
        System.out.println("RomanHorseman");
    }
}
