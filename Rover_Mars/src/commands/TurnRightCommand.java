package commands;

import rover.Rover;
import java.util.logging.Logger;

public class TurnRightCommand implements Command {
    private final Rover rover;
    private static final Logger logger = Logger.getLogger(TurnRightCommand.class.getName());

    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        logger.info("Executing TurnRightCommand: Rover turning right from facing " + rover.getDirection());
        rover.turnRight();
        logger.info("Rover new direction: " + rover.getDirection());
    }
}
