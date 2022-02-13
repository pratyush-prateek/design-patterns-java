package com.designpatters.command;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        /*
        * Problem statement - There are many types of lights. The client needs to toggle one of them on or off
        * or be able to toggle all of them at once. Need to use the command pattern here */

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Light livingroomLight = new Light();

        List<Light> lights = new ArrayList<Light>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        lights.add(livingroomLight);

        Command toggleCommandBedroomLight = new ToggleCommand(bedroomLight);
        Command toggleCommandKitchenLight = new ToggleCommand(kitchenLight);
        Command toggleCommandLivingRoomLight = new ToggleCommand(livingroomLight);
        Command toggleAllOn = new TurnAllOnCommand(lights);
        Command toggleAllOff = new TurnAllOffCommand(lights);

        Switch lightSwitch = new Switch();
        //Toggle kitchen and bedroom light
        lightSwitch.storeAndExecute(toggleCommandKitchenLight);
        lightSwitch.storeAndExecute(toggleCommandBedroomLight);

        //Toggle all On
        lightSwitch.storeAndExecute(toggleAllOn);

        //Toggle living room light off
        lightSwitch.storeAndExecute(toggleCommandLivingRoomLight);

        //Toggle all Off
        lightSwitch.storeAndExecute(toggleAllOff);


    }
}
