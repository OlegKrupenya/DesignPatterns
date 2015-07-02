package com.testdev.interview.dp.gof.behavioral.strategy;

/**
 * Encapsulates an algorithm inside a class
 * Created by oleh.krupenia on 7/2/2015.
 */
public class StrategyApp {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyA);
        context.algorithm();
        context.setStrategy(strategyB);
        context.algorithm();
    }
}
