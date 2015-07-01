package com.testdev.interview.dp.gof.behavior.state;

/**
 * Created by Taipan on 02.07.2015.
 */
public class StateApp {
    public static void main(String[] args) {
        State stateA = new ConcreteStateA();
        State stateB = new ConcreteStateB();
        Context context = new Context();
        context.setState(stateA);
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
