package com.designpatters.logger;

public class LoggerFactory {
    public static Logger getLogger()  {
        return new InfoLogger(new ErrorLogger(new DebugLogger(null)));
    }
}
