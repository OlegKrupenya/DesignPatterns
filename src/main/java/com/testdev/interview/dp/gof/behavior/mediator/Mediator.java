package com.testdev.interview.dp.gof.behavior.mediator;

/**
 * Defines simplified communication between classes
 * Created by Taipan on 02.07.2015.
 */
public interface Mediator {
    void sendMessage(String msg, Colleague colleague);
    void setColleague1(Colleague colleague1);
    void setColleague2(Colleague colleague2);
}
