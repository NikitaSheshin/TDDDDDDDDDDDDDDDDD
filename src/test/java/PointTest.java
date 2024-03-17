import org.example.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class PointTest {
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

    private static Stream<Arguments> correctData() {
        return Stream.of(
                Arguments.of(90, 0),
                Arguments.of(-90, 0),
                Arguments.of(0, -180),
                Arguments.of(0, 180),
                Arguments.of(89, 0),
                Arguments.of(-89, 0),
                Arguments.of(0, -179),
                Arguments.of(0, 179)
        );
    }

    @ParameterizedTest
    @MethodSource("incorrectData")
    void testMethodWithAutoboxing(double a, double b) {
        assertThrows(IllegalArgumentException.class, () -> new Point(a, b));
    }

    @ParameterizedTest
    @MethodSource("correctData")
    public void testMethodCtorCreatePoint(double a, double b) {
        Point p = new Point(a, b);
        Assertions.assertNotNull(p);
    }
}
