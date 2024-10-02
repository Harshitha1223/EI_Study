
class RightCommand implements Command {
    private MarsRover rover;

    public RightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
