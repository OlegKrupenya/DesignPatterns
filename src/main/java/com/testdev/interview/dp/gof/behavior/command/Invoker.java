package com.testdev.interview.dp.gof.behavior.command;

/**
 * Created by Taipan on 02.07.2015.
 */
public class Invoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
