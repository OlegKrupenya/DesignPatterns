package com.testdev.interview.dp.gof.behavioral.mediator;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteColleague1 implements Colleague {
    private Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String msg) {
        mediator.sendMessage(msg, this);
    }

    @Override
    public void notify(String msg) {
        System.out.println("ConcreteColleague1.notify");
    }
}
