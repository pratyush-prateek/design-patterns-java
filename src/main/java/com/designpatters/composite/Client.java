package com.designpatters.composite;

public class Client {
    public static void main(String[] args) {
        /*
        * /menu1/child1
        *       /child2
        *       /child3
        * */
        Menu mainMenu = new Menu("menu1","/menu1");
        MenuItem childItem1 = new MenuItem("child1","/child1");
        MenuItem childItem2 = new MenuItem("child2","/child2");
        MenuItem childItem3 = new MenuItem("child3","/child3");
        mainMenu.add(childItem1);
        mainMenu.add(childItem2);
        mainMenu.add(childItem3);
        System.out.println(mainMenu.toString());

        /*
        * /menu2/child4
        *       /child5
        *       /child6
        * */

        Menu subMenu = new Menu("menu2","/menu2");
        MenuItem childItem4 = new MenuItem("child4","/child4");
        MenuItem childItem5 = new MenuItem("child5","/child5");
        MenuItem childItem6 = new MenuItem("child6","/child6");
        subMenu.add(childItem4);
        subMenu.add(childItem5);
        subMenu.add(childItem6);

        System.out.println(subMenu.toString());

        //Adding sub mneu to main menu and then printing it
        mainMenu.add(subMenu);
        System.out.println(mainMenu.toString());

    }
}
