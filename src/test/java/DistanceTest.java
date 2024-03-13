import org.junit.Test;

public class DistanceTest {
    @Test
    public void TestMethodCtorThrowsArgumentOutOfRangeException() {
        Point p;
        double a = -1000., b = -1000.;

        p = new Point(a, b);
    }
}
