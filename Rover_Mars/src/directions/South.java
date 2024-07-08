package directions;

import rover.Rover;

public class South extends Direction {
    @Override
    public void moveForward(Rover rover) {
        rover.setY(rover.getY() - 1);
    }

    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public String getName() {
        return "South";
    }
}
