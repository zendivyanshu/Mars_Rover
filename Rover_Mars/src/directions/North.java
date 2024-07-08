package directions;

import rover.Rover;

public class North extends Direction {
    @Override
    public void moveForward(Rover rover) {
        rover.setY(rover.getY() + 1);
    }

    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public String getName() {
        return "North";
    }
}
