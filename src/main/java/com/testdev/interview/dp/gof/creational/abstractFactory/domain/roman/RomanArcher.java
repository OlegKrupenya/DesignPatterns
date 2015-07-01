package com.testdev.interview.dp.gof.creational.abstractFactory.domain.roman;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Archer;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RomanArcher implements Archer {
    @Override
    public void info() {
        System.out.println("RomanArcher");
    }
}
