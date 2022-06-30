package com.designpatters.command;

import java.util.List;

public class RemoteController {
    private static RemoteController instance;
    private List<Command> commands;
    private Command lastExecutedCommand;
    private RemoteController(List<Command> commands) {
        this.commands = commands;
    }

    public static RemoteController getInstance(List<Command> commands) {
        if(RemoteController.instance == null) {
            synchronized (RemoteController.class) {
                RemoteController.instance = new RemoteController(commands);
            }
        }

        return RemoteController.instance;
    }

    public void executeCommand(int index) {
        Command command = commands.get(index);
        this.lastExecutedCommand = command;
        command.execute();
        System.out.println(this.toString());
    }

    public void undoLastCommand() throws Exception {
        if(this.lastExecutedCommand == null)
            throw new Exception("No command executed");

        this.lastExecutedCommand.undo();
        this.lastExecutedCommand = null;
    }

    @Override
    public String toString() {
        return "RemoteController{" +
                "commands=" + commands.toString() +
                ", lastExecutedCommand=" + lastExecutedCommand.toString() +
                '}';
    }
}
