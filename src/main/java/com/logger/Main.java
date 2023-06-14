package com.logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = new FileLogger("logger-output.log");
        logger.log("Example log message");
        
        logger = new ConsoleLogger("logger-output.log");
        logger.log("Example log message");
    }
}
