import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;
import directions.Direction;
import directions.North;
import grid.Grid;
import grid.Obstacle;
import rover.Rover;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Obstacle(2, 2));
        grid.addObstacle(new Obstacle(3, 5));

        Direction initialDirection = new North();
        Rover rover = new Rover(0, 0, initialDirection, grid);

        Command[] commands = {
                new MoveCommand(rover),
                new MoveCommand(rover),
                new TurnRightCommand(rover),
                new MoveCommand(rover),
                new TurnLeftCommand(rover),
                new MoveCommand(rover)
        };

        for (Command command : commands) {
            command.execute();
        }

        System.out.println(rover.getStatus());
    }
}
