package com.testdev.interview.dp.gof.creational.abstractFactory.factory;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Archer;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Horseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Infantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public abstract class Factory {
    public abstract Infantryman createInfantryman();
    public abstract Horseman createHorseman();
    public abstract Archer createArcher();
}
