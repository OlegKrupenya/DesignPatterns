package com.testdev.interview.dp.gof.behavioral.strategy;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        this.strategy.algorithm();
    }
}
