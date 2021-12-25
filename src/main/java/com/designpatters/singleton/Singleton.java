package com.designpatters.singleton;

public class Singleton {

    //Not thread safe
    private static Singleton instance = null;
    public Singleton() {}

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
