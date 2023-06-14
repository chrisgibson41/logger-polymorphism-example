package com.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
    A file based logger that outputs the log content to the given file
 */
public class FileLogger extends Logger {
    private final String filePath;

    public FileLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected void logMessage(String message) {
        Path filePath = Path.of(this.filePath);
        try (FileWriter fileWriter = new FileWriter(filePath.toFile(), true)) {
            // Insert a new ling
            fileWriter.append(System.lineSeparator());
            // Write the log message
            fileWriter.append(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
