package rover;

import directions.Direction;
import grid.Grid;
import java.util.logging.Logger;

public class Rover {
    private int x;
    private int y;
    private Direction direction;
    private final Grid grid;
    private static final Logger logger = Logger.getLogger(Rover.class.getName());

    public Rover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x;
        int newY = y;
        direction.moveForward(this);
        if (!grid.isWithinBounds(x, y) || grid.isObstacle(x, y)) {
            logger.warning("Move blocked: (" + x + ", " + y + ") is out of bounds or an obstacle.");
            x = newX;
            y = newY;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction.getName() + ".";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }
}
