package com.designpatters.logger;

public class Client {
    public static void main(String args[])throws Exception {
        Logger logger = LoggerFactory.getLogger();
        logger.log(LogLevel.DEBUG, "Debug message");
        logger.log(LogLevel.ERROR, "Error message");
        logger.log(LogLevel.INFO, "Info message");
    }
}
