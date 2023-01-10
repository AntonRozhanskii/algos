import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MySolutionTest {

    private final MySolution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void isPalindrome(int underTest, boolean expected) {
        boolean actual = testObj.isPalindrome(underTest);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }
}