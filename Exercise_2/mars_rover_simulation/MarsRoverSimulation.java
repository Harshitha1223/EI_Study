
import java.util.Arrays;
import java.util.HashSet;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10, new HashSet<>(Arrays.asList(new Point(2, 2), new Point(3, 5))));
        MarsRover rover = new MarsRover(0, 0, Direction.N, grid);

        List<Command> commands = Arrays.asList(
                new MoveCommand(rover),
                new MoveCommand(rover),
                new RightCommand(rover),
                new MoveCommand(rover),
                new LeftCommand(rover),
                new MoveCommand(rover)
        );

        RoverController controller = new RoverController(commands);
        controller.executeCommands();

        System.out.println(rover.getStatus());
    }
}
