package com.logger;

public class Main {

    public static void main(String[] args) {
        var logger = new FileLogger("logger-output.log");
        logger.log("Example log message");
    }
}
