package com.logger;

import java.time.LocalDateTime;

public abstract class Logger {
    public void log(String message) {
        LocalDateTime timestamp = LocalDateTime.now();
        logMessage(String.format("%s %s", timestamp, message));
    }

    protected abstract void logMessage(String message);
}
