// Main.java
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("This is the first log message.");
        logger.log("This is the second log message.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This is another log message from the same instance.");

        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
    }
}