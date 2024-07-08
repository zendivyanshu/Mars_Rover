package commands;

import grid.Grid;
import grid.Obstacle;
import rover.Rover;
import directions.North;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveCommandTest {

    @Test
    public void testMoveCommandMovesTheRoverForward() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);
        MoveCommand command = new MoveCommand(rover);

        command.execute();

        assertEquals("Rover is at (1, 3) facing N.", rover.getStatus());
    }

    @Test
    public void testMoveCommandBlockedByObstacle() {
        Grid grid = new Grid(5, 5);
        grid.addObstacle(new Obstacle(1, 3));
        Rover rover = new Rover(1, 2, new North(), grid);
        MoveCommand command = new MoveCommand(rover);

        command.execute();

        assertEquals("Rover is at (1, 2) facing N.", rover.getStatus());
    }

    @Test
    public void testMoveCommandOutOfBounds() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 4, new North(), grid);
        MoveCommand command = new MoveCommand(rover);

        command.execute();

        assertEquals("Rover is at (1, 4) facing N.", rover.getStatus());
    }
}
