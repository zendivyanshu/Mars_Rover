package grid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ObstacleTest {

    @Test
    public void testIsObstacle() {
        Obstacle obstacle = new Obstacle(2, 2);

        assertTrue(obstacle.isObstacle(2, 2));
        assertFalse(obstacle.isObstacle(3, 3));
    }
}
