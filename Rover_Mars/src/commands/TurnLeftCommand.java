package commands;

import rover.Rover;
import java.util.logging.Logger;

public class TurnLeftCommand implements Command {
    private final Rover rover;
    private static final Logger logger = Logger.getLogger(TurnLeftCommand.class.getName());

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        logger.info("Executing TurnLeftCommand: Rover turning left from facing " + rover.getDirection());
        rover.turnLeft();
        logger.info("Rover new direction: " + rover.getDirection());
    }
}
