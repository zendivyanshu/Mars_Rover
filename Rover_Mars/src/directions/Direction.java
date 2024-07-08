package directions;

import rover.Rover;

public abstract class Direction {
    public abstract void moveForward(Rover rover);
    public abstract Direction turnLeft();
    public abstract Direction turnRight();
    public abstract String getName();
}
