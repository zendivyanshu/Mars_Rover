package grid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GridTest {

    @Test
    public void testIsWithinBounds() {
        Grid grid = new Grid(5, 5);

        assertTrue(grid.isWithinBounds(3, 3));
        assertFalse(grid.isWithinBounds(6, 3));
        assertFalse(grid.isWithinBounds(3, 6));
        assertFalse(grid.isWithinBounds(-1, 3));
        assertFalse(grid.isWithinBounds(3, -1));
    }

    @Test
    public void testIsObstacle() {
        Grid grid = new Grid(5, 5);
        grid.addObstacle(new Obstacle(2, 2));

        assertTrue(grid.isObstacle(2, 2));
        assertFalse(grid.isObstacle(3, 3));
    }
}
