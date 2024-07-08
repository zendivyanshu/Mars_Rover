package directions;

import grid.Grid;
import rover.Rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SouthTest {

    @Test
    public void testMoveForward() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new South(), grid);
        rover.move();

        assertEquals("Rover is at (1, 1) facing South.", rover.getStatus());
    }

    @Test
    public void testTurnLeft() {
        Direction south = new South();
        Direction east = south.turnLeft();

        assertEquals("East", east.getName());
    }

    @Test
    public void testTurnRight() {
        Direction south = new South();
        Direction west = south.turnRight();

        assertEquals("West", west.getName());
    }
}
