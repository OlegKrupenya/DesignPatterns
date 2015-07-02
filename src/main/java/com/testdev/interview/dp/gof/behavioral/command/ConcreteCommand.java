package com.testdev.interview.dp.gof.behavioral.command;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
