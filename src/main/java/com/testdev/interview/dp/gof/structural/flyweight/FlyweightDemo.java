package com.testdev.interview.dp.gof.structural.flyweight;

import java.util.HashMap;

/**
 * A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects
 * Created by oleh.krupenia on 7/1/2015.
 */
public class FlyweightDemo {
    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx = f.getFlyweight("X");

        fx.Operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.Operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.Operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new
                UnsharedConcreteFlyweight();

        uf.Operation(--extrinsicstate);

    }
}

abstract class Flyweight {
    public abstract void Operation(int extrinsicstate);
}

class ConcreteFlyweight extends Flyweight {
    public void Operation(int extrinsicstate) {
        System.out.println("ConcreteFlyweight: " + extrinsicstate);
    }
}


class UnsharedConcreteFlyweight extends Flyweight {
    public void Operation(int extrinsicstate) {
        System.out.println("UnsharedConcreteFlyweight: " +
                extrinsicstate);
    }
}

class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
