import org.example.AzimuthCalculator;
import org.example.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AzimuthCalculatorTest {
    private static AzimuthCalculator calculator;

    @BeforeAll
    public static void initCalculator() {
        calculator = new AzimuthCalculator();
    }

    @Test
    public void ifLineIntersectEarthCenter() {
        var northPoint = new Point(50., 120.);
        var southPoint = new Point(-50, -120);

        Assertions.assertEquals(
                -2,
                calculator.calculateAzimuth(northPoint, southPoint),
                0.0001);
    }

    @Test
    public void equalsPointTest() {
        var testPoint = new Point(50, 50);

        Assertions.assertEquals(
                -1,
                calculator.calculateAzimuth(testPoint, testPoint),
                0.0001);
    }
}
