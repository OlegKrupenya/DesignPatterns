package com.testdev.interview.dp.gof.creational.builder.creator;

import com.testdev.interview.dp.gof.creational.builder.domain.Army;
import com.testdev.interview.dp.gof.creational.builder.domain.Horseman;
import com.testdev.interview.dp.gof.creational.builder.domain.Infantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class CarthaginianBuilder implements Builder {
    private Army army;

    @Override
    public void createArmy() {
        this.army = new Army();
    }

    @Override
    public void createArcher() {

    }

    @Override
    public void createHorseman() {
        this.army.getCavalry().add(new Horseman());
    }

    @Override
    public void createInfantryman() {
        this.army.getInfantryman().add(new Infantryman());
    }

    @Override
    public Army getArmy() {
        return this.army;
    }
}
