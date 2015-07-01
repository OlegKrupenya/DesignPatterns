package com.testdev.interview.dp.gof.creational.builder.creator;

import com.testdev.interview.dp.gof.creational.builder.domain.Archer;
import com.testdev.interview.dp.gof.creational.builder.domain.Army;
import com.testdev.interview.dp.gof.creational.builder.domain.Horseman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RomanBuilder implements Builder {
    private Army army;

    @Override
    public void createArmy() {
        this.army = new Army();
    }

    @Override
    public void createArcher() {
        this.army.getArchers().add(new Archer());
    }

    @Override
    public void createHorseman() {
        this.army.getCavalry().add(new Horseman());
    }

    @Override
    public void createInfantryman() {
    }

    @Override
    public Army getArmy() {
        return this.army;
    }
}
