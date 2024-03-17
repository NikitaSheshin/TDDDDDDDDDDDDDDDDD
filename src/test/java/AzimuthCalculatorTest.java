import org.example.Point;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class AzimuthCalculatorTest {
    private AzimuthCalculator calculator;

    @BeforeAll
    public void initCalculator() {
        calculator = new AzimuthCalculator();
    }

    @Test
    public void ifLineIntersectEarthCenter() {
        var northPoint = new Point(50., 120.);
        var southPoint = new Point(-50, 10);

        var calculator = new AzimuthCalculator();

        assertEquals(0., calculator.calculateAzimuth(northPoint, southPoint));
    }
}
