package com.testdev.interview.dp.gof.creational.abstractFactory.main;

import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Archer;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Horseman;
import com.testdev.interview.dp.gof.creational.abstractFactory.domain.Infantryman;
import com.testdev.interview.dp.gof.creational.abstractFactory.factory.CarthaginianFactory;
import com.testdev.interview.dp.gof.creational.abstractFactory.factory.Factory;
import com.testdev.interview.dp.gof.creational.abstractFactory.factory.RomanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates an instance of several families of classes
 * Created by oleh.krupenia on 7/1/2015.
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        Army romanArmy = new Army(new RomanFactory());
        Army carthaginianArmy = new Army(new CarthaginianFactory());
        romanArmy.info();
        carthaginianArmy.info();
    }

    private static class Army {
        private List<Archer> archers = new ArrayList<>();
        private List<Infantryman> infantryman = new ArrayList<>();
        private List<Horseman> cavalry = new ArrayList<>();

        public Army(Factory factory) {
            this.archers.add(factory.createArcher());
            this.infantryman.add(factory.createInfantryman());
            this.cavalry.add(factory.createHorseman());
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
}
