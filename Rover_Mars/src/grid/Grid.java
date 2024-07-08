package grid;

import java.util.ArrayList;
import java.util.List;

public class Grid extends GridComponent {
    private final int width;
    private final int height;
    private final List<GridComponent> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new ArrayList<>();
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }

    @Override
    public boolean isObstacle(int x, int y) {
        for (GridComponent obstacle : obstacles) {
            if (obstacle.isObstacle(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isWithinBounds(int x, int y) {
        return 0 <= x && x < width && 0 <= y && y < height;
    }
}
