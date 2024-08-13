import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute("Log message");
        }
    }
}
