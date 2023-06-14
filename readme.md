The following is an example demonstrates the user and power of polymorphism by implementing a logger system.

The Logger abstract class provides a common base for logger implementations. It contains an abstract method log(String message) that subclasses must override and provide their own implementation.

# Logger subclasses
Two logger subclasses are provided in this example:
    - FileLogger: Logs messages to a file.
    - ConsoleLogger: Logs messages to the console.

Both subclasses extend the Logger abstract class and override the log method with their specific logging behavior.

# Polymorphism
In the Main class, instances of FileLogger and ConsoleLogger are created and assigned to variables of type Logger, which is the abstract class type. This enables polymorphism, allowing us to treat these instances interchangeably as instances of the Logger abstract class.
By calling the log method on these instances, the message is appended with a timestamp before being logged. The appropriate logging implementation for each subclass is executed, enabling logging messages to a file or to the console, depending on the specific subclass implementation.

By coding with the abstract logger, it means that we don't need to modify our code if we decide to implement a new type of logger. An example of this could be a database logger, where we output our log files to a database table, an api logger where we log messages and persist to a rest api.

# Usage
To use the logger system, follow these steps:

    1 - Create subclasses that extend the Logger abstract class.
    2 - Override the logMessage method in each subclass to provide the desired logging functionality.
    3 - Create instances of your logger subclasses, assigning them to variables of type Logger.
    4 - Use the log method on these instances to log messages. The logging behavior will be determined by the specific implementation of the subclass.

# Example usage:
    Logger fileLogger = new FileLogger("/path/to/file/example.log");
    fileLogger.log("Example log message");

    Logger consoleLogger = new ConsoleLogger();
    fileLogger.log("Example log message");

The output of the above would be '2023-06-14T19:09:02.172754 Example log message' in the file output and the console output