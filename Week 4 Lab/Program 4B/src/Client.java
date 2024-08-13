public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNext(debugHandler);
        debugHandler.setNext(errorHandler);

        Logger logger = new Logger();
        logger.addCommand(new LogCommand(infoHandler, LogLevel.INFO));
        logger.addCommand(new LogCommand(infoHandler, LogLevel.DEBUG));
        logger.addCommand(new LogCommand(infoHandler, LogLevel.ERROR));

        logger.executeCommands();
    }
}
