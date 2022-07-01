package com.designpatters.mementousingsnapshot;

import java.util.List;

public class Controller {
    private List<Command> commands;
    private static Controller instance;
    private Controller(List<Command> commands) {
        this.commands = commands;
    }

    public static Controller getInstance(List<Command> commands) {
        if(Controller.instance == null) {
            synchronized(Controller.class) {
                Controller.instance = new Controller(commands);
            }
        }

        return Controller.instance;
    }

    public void executeCommandWithMapping(int index)throws Exception {
        this.commands.get(index).execute();
    }
}
