package com.designpatters.logger;

public abstract class Logger {
    protected Logger next;
    public Logger(Logger next) {
        this.next = next;
    }

    public abstract void log(LogLevel logLevel, String message);
}
