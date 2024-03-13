import org.example.Point;
import org.junit.Test;

public class DistanceTest {
    @Test(expected = IllegalArgumentException.class)
    public void TestMethodCtorThrowsArgumentOutOfRangeException() {
        Point p;
        double a = -1000., b = -1000.;

        p = new Point(a, b);
    }
}
