package com.testdev.interview.dp.gof.creational.factory.method.creators;

import com.testdev.interview.dp.gof.creational.factory.method.domain.Archer;
import com.testdev.interview.dp.gof.creational.factory.method.domain.Warrior;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class ArchersCreator extends Creator {
    @Override
    public Warrior createWarrior() {
        return new Archer();
    }
}
