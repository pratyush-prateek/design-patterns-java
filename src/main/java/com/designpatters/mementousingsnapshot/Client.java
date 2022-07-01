package com.designpatters.mementousingsnapshot;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[])throws Exception {

        //Assembling instances
        //Originator instance
        Originator originator = new Originator(12,13,"ABCDEF");

        //Memento service
        MementoService mementoService = MementoService.getInstance();

        //Commands
        /*
        * 0 - set state 1
        * 1 - set state 2
        * 2 - set state 3
        * 3 - undo to previous state
        * */
        List<Command> commands = new ArrayList<>();
        commands.add(new SetState1Command(mementoService, originator));
        commands.add(new SetState2Command(mementoService, originator));
        commands.add(new SetState3Command(mementoService, originator));
        commands.add(new UndoCommand(mementoService));

        //Controller instance - sender
        Controller controller = Controller.getInstance(commands);

        //Execute commands
        controller.executeCommandWithMapping(0);
        controller.executeCommandWithMapping(1);
        System.out.println(originator.toString());

        //undo
        controller.executeCommandWithMapping(3);
        System.out.println(originator.toString());
        controller.executeCommandWithMapping(3);
        System.out.println(originator.toString());

        controller.executeCommandWithMapping(2);
        System.out.println(originator.toString());
        controller.executeCommandWithMapping(3);
        System.out.println(originator.toString());
    }
}
