package com.testdev.interview.dp.gof.behavioral.command;

/**
 * Created by Taipan on 02.07.2015.
 */
public class CommandApp {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
