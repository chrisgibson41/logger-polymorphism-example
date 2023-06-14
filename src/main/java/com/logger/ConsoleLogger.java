package com.logger;

/**
 * A simple console logger implementation that outputs the log content to the terminal
 */
public class ConsoleLogger extends Logger {
    @Override
    protected void logMessage(String message) {
        System.out.println(message);
    }
}
