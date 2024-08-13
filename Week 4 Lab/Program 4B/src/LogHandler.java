abstract class LogHandler {
    protected LogHandler next;

    public void setNext(LogHandler next) {
        this.next = next;
    }

    public void handle(String message, LogLevel level) {
        if (next != null) {
            next.handle(message, level);
        }
    }
}
