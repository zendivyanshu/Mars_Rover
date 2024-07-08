package grid;

public class Obstacle extends GridComponent {
    private final int x;
    private final int y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isObstacle(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public boolean isWithinBounds(int x, int y) {
        return true;
    }
}
