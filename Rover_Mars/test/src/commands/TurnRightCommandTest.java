package commands;

import grid.Grid;
import rover.Rover;
import directions.North;
import directions.East;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnRightCommandTest {

    @Test
    public void testTurnRightCommand() {
        Grid grid = new Grid(5, 5);
        Rover rover = new Rover(1, 2, new North(), grid);
        TurnRightCommand command = new TurnRightCommand(rover);

        command.execute();

        assertEquals("Rover is at (1, 2) facing East.", rover.getStatus());
    }
}
