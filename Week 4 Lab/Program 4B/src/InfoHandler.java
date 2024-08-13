class InfoHandler extends LogHandler {
    @Override
    public void handle(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.handle(message, level);
        }
    }
}

class DebugHandler extends LogHandler {
    @Override
    public void handle(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.handle(message, level);
        }
    }
}

class ErrorHandler extends LogHandler {
    @Override
    public void handle(String message, LogLevel level) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.handle(message, level);
        }
    }
}
