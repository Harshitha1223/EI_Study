
import java.util.List;

class RoverController {
    private List<Command> commands;

    public RoverController(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
