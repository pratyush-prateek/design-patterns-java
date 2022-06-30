package com.designpatters.command;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) throws Exception {
        //Remote mapping
        /*
        * 0 - toggle kitchen light
        * 1 - toggle living room light
        * 2 - toggle kitchen fan
        * 3 - set kitchen fan low
        * 4 - set kitchen fan medium
        * 5 - set kitchen fan high
        * 6 - undo last
        * */

        //Reciever classes
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        Fan kitchenFan  = new Fan();

        //Commands
        List<Command> commands = new ArrayList<>();
        commands.add(new ToggleLightCommand(kitchenLight));
        commands.add(new ToggleLightCommand(livingRoomLight));
        commands.add(new ToggleFanCommand(kitchenFan));
        commands.add(new SetFanSpeedLowCommand(kitchenFan));
        commands.add(new SetFanSpeedMediumCommand(kitchenFan));
        commands.add(new SetFanSpeedHigh(kitchenFan));


        //Remote controller instance
        RemoteController controller = RemoteController.getInstance(commands);

        //Toggle kitchen light on
        controller.executeCommand(0);

        //Toggle living room light
        controller.executeCommand(1);

        //Toggle kitchen fan
        controller.executeCommand(2);

        //set kitchen fan high
        controller.executeCommand(5);

        //set living room light off
        controller.executeCommand(1);

        //set kitchen fan slow
        controller.executeCommand(3);

        //undo last
        controller.undoLastCommand();
    }

}
