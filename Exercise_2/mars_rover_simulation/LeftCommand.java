
class LeftCommand implements Command {
    private MarsRover rover;

    public LeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
