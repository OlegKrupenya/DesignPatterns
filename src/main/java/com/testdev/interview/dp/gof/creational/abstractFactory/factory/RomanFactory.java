package com.testdev.interview.dp.gof.creational.abstractFactory.factory;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Archer;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Horseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Infantryman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.roman.RomanArcher;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.roman.RomanHorseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.roman.RomanInfantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class RomanFactory extends Factory {
    @Override
    public Infantryman createInfantryman() {
        return new RomanInfantryman();
    }

    @Override
    public Horseman createHorseman() {
        return new RomanHorseman();
    }

    @Override
    public Archer createArcher() {
        return new RomanArcher();
    }
}
