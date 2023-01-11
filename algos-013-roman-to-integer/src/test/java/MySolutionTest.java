import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MySolutionTest {

    private final MySolution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void romanToInt(String underTest, int expected) {
        int actual = testObj.romanToInt(underTest);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("MMMCMXCIX", 3999)
        );
    }
}
