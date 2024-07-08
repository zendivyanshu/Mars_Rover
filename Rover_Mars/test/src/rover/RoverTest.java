package rover;

import grid.Grid;
import grid.Obstacle;
import directions.North;
import directions.East;
import directions.South;
import directions.West;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testRoverInitialStatus() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);

        assertEquals("Rover is at (1, 2) facing N.", rover.getStatus());
    }

    @Test
    public void testRoverMove() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);

        rover.move();
        assertEquals("Rover is at (1, 3) facing N.", rover.getStatus());
    }

    @Test
    public void testRoverTurnLeft() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);

        rover.turnLeft();
        assertEquals("Rover is at (1, 2) facing W.", rover.getStatus());
    }

    @Test
    public void testRoverTurnRight() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);

        rover.turnRight();
        assertEquals("Rover is at (1, 2) facing E.", rover.getStatus());
    }

    @Test
    public void testRoverMoveBlockedByObstacle() {
        Grid grid = new Grid(5, 5);
        grid.addObstacle(new Obstacle(1, 3));
        Rover rover = new Rover(1, 2, new North(), grid);

        rover.move();
        assertEquals("Rover is at (1, 2) facing N.", rover.getStatus());
    }

    @Test
    public void testRoverMoveOutOfBounds() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 4, new North(), grid);

        rover.move();
        assertEquals("Rover is at (1, 4) facing N.", rover.getStatus());
    }

    @Test
    public void testRoverMoveEast() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new East(), grid);

        rover.move();
        assertEquals("Rover is at (2, 2) facing E.", rover.getStatus());
    }

    @Test
    public void testRoverMoveSouth() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new South(), grid);

        rover.move();
        assertEquals("Rover is at (1, 1) facing S.", rover.getStatus());
    }

    @Test
    public void testRoverMoveWest() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new West(), grid);

        rover.move();
        assertEquals("Rover is at (0, 2) facing W.", rover.getStatus());
    }
}
