package com.testdev.interview.dp.gof.behavioral.mediator;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteMediator implements Mediator {
    private Colleague colleague1;
    private Colleague colleague2;

    public ConcreteMediator() {
    }

    @Override
    public void setColleague1(Colleague colleage1) {
        this.colleague1 = colleage1;
    }

    @Override
    public void setColleague2(Colleague colleage2) {
        this.colleague2 = colleage2;
    }

    @Override
    public void sendMessage(String msg, Colleague colleague) {
        if (colleague instanceof ConcreteColleague1) {
            colleague2.notify(msg);
        } else {
            colleague1.notify(msg);
        }
    }
}
