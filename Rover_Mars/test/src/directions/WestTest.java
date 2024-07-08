package direction;

import grid.Grid;
import rover.Rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WestTest {

    @Test
    public void testMoveForward() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new West(), grid);
        rover.move();

        assertEquals("Rover is at (0, 2) facing West.", rover.getStatus());
    }

    @Test
    public void testTurnLeft() {
        Direction west = new West();
        Direction south = west.turnLeft();

        assertEquals("South", south.getName());
    }

    @Test
    public void testTurnRight() {
        Direction west = new West();
        Direction north = west.turnRight();

        assertEquals("North", north.getName());
    }
}
