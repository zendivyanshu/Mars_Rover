package directions;

import grid.Grid;
import rover.Rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NorthTest {

    @Test
    public void testMoveForward() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);
        rover.move();

        assertEquals("Rover is at (1, 3) facing North.", rover.getStatus());
    }

    @Test
    public void testTurnLeft() {
        Direction north = new North();
        Direction west = north.turnLeft();

        assertEquals("West", west.getName());
    }

    @Test
    public void testTurnRight() {
        Direction north = new North();
        Direction east = north.turnRight();

        assertEquals("East", east.getName());
    }
}
