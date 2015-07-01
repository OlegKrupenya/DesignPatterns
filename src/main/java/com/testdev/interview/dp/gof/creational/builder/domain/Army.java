package com.testdev.interview.dp.gof.creational.builder.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Army {
    private List<Archer> archers = new ArrayList<>();
    private List<Infantryman> infantryman = new ArrayList<>();
    private List<Horseman> cavalry = new ArrayList<>();

    public List<Archer> getArchers() {
        return archers;
    }

    public List<Infantryman> getInfantryman() {
        return infantryman;
    }

    public List<Horseman> getCavalry() {
        return cavalry;
    }

    public void info() {
        for (Archer archer : archers) {
            archer.info();
        }
        for (Infantryman infantry : infantryman) {
            infantry.info();
        }
        for (Horseman horseman : cavalry) {
            horseman.info();
        }
    }
}
