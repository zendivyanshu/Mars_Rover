package directions;

import rover.Rover;

public class East extends Direction {
    @Override
    public void moveForward(Rover rover) {
        rover.setX(rover.getX() + 1);
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public String getName() {
        return "East";
    }
}
