package com.testdev.interview.dp.gof.creational.factory.method.creators;

import com.testdev.interview.dp.gof.creational.factory.method.domain.Infantryman;
import com.testdev.interview.dp.gof.creational.factory.method.domain.Warrior;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class InfantryCreator extends Creator {
    @Override
    public Warrior createWarrior() {
        return new Infantryman();
    }
}
