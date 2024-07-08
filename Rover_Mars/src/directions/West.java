package directions;

import rover.Rover;

public class West extends Direction {
    @Override
    public void moveForward(Rover rover) {
        rover.setX(rover.getX() - 1);
    }

    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public String getName() {
        return "West";
    }
}
