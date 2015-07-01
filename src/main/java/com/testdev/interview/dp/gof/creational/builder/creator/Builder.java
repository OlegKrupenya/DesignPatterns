package com.testdev.interview.dp.gof.creational.builder.creator;

import com.testdev.interview.dp.gof.creational.builder.domain.Archer;
import com.testdev.interview.dp.gof.creational.builder.domain.Army;
import com.testdev.interview.dp.gof.creational.builder.domain.Horseman;
import com.testdev.interview.dp.gof.creational.builder.domain.Infantryman;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public interface Builder {
    void createArmy();
    void createArcher();
    void createHorseman();
    void createInfantryman();
    Army getArmy();
}
