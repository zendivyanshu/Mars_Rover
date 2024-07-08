package commands;

import rover.Rover;
import java.util.logging.Logger;

public class MoveCommand implements Command {
    private final Rover rover;
    private static final Logger logger = Logger.getLogger(MoveCommand.class.getName());

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        logger.info("Executing MoveCommand: Rover moving forward from (" + rover.getX() + ", " + rover.getY() + ") facing " + rover.getDirection());
        rover.move();
        logger.info("Rover new position: (" + rover.getX() + ", " + rover.getY() + ")");
    }
}
