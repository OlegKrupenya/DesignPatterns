package com.testdev.interview.dp.gof.creational.builder.creator;

import com.testdev.interview.dp.gof.creational.builder.domain.Army;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Director {
    public Army createArmy(Builder builder) {
        builder.createArmy();
        builder.createArcher();
        builder.createHorseman();
        builder.createInfantryman();
        return builder.getArmy();
    }
}
