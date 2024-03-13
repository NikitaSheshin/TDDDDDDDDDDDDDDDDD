import org.example.Point;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class DistanceTest {
    private static Stream<Arguments> incorrectData() {
        return Stream.of(
                Arguments.of(-1000., -1000.),
                Arguments.of(1000, 1000),
                Arguments.of(91, 0),
                Arguments.of(-91, 0),
                Arguments.of(0, -181),
                Arguments.of(0, 181)
        );
    }

    @ParameterizedTest
    @MethodSource("incorrectData")
    void testMethodWithAutoboxing(double a, double b) {
        assertThrows(IllegalArgumentException.class, () -> new Point(a, b));
    }

    @Test
    public void testMethodCtorCreatePoint() {
        Point p;
        double a = 0., b = 0.;

        p = new Point(a, b);
        assertNotNull(p);
    }
}
