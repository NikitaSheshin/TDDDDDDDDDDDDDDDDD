import org.example.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTest {
    @Test(expected = IllegalArgumentException.class)
    public void TestMethodCtorThrowsArgumentOutOfRangeException() {
        Point p;
        double a = -1000., b = -1000.;

        p = new Point(a, b);
    }

    @Test
    public void TestMethodCtorCreatePoint() {
        Point p;
        double a = 0., b = 0.;

        p = new Point(a, b);
        assertNotNull(p);
    }
}
