package grid;

public abstract class GridComponent {
    public abstract boolean isObstacle(int x, int y);
    public abstract boolean isWithinBounds(int x, int y);
}
