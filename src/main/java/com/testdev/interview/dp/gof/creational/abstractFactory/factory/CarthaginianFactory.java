package com.testdev.interview.dp.gof.creational.abstractFactory.factory;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Archer;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Horseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Infantryman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.carthaginian.CarthaginianArcher;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.carthaginian.CarthaginianHorseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.carthaginian.CarthaginianInfantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class CarthaginianFactory extends Factory {
    @Override
    public Infantryman createInfantryman() {
        return new CarthaginianInfantryman();
    }

    @Override
    public Horseman createHorseman() {
        return new CarthaginianHorseman();
    }

    @Override
    public Archer createArcher() {
        return new CarthaginianArcher();
    }
}
