import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaTest {
    @Test
    public void testCircleArea() {
        assertEquals(3.14159, CircleArea.circleArea(1.0), 0.001);
        assertEquals(78.5398, CircleArea.circleArea(5.0), 0.001);
        assertEquals(0.0, CircleArea.circleArea(0.0), 0.001);
    }
}
