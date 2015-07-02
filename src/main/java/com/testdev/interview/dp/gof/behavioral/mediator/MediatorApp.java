package com.testdev.interview.dp.gof.behavioral.mediator;

/**
 * Created by Taipan on 02.07.2015.
 */
public class MediatorApp {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        colleague1.sendMessage("test");
        colleague2.sendMessage("test2");
    }
}
