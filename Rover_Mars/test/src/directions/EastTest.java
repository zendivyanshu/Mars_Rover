
package directions;

import grid.Grid;
import rover.Rover;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EastTest {

    @Test
    public void testMoveForward() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new East(), grid);
        rover.move();

        assertEquals("Rover is at (2, 2) facing East.", rover.getStatus());
    }

    @Test
    public void testTurnLeft() {
        Direction east = new East();
        Direction north = east.turnLeft();

        assertEquals("North", north.getName());
    }

    @Test
    public void testTurnRight() {
        Direction east = new East();
        Direction south = east.turnRight();

        assertEquals("South", south.getName());
    }
}
