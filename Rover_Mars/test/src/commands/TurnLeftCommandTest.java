package commands;

import grid.Grid;
import rover.Rover;
import directions.North;
import directions.West;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnLeftCommandTest {

    @Test
    public void testTurnLeftCommand() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);
        TurnLeftCommand command = new TurnLeftCommand(rover);

        command.execute();

        assertEquals("Rover is at (1, 2) facing West.", rover.getStatus());
    }
}
