package com.designpatters.observer;

public class Notification {
    private String message;
    public Notification(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                '}';
    }
}
