import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheirSolutionTest {

    private final TheirSolution testObj = new TheirSolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void longestCommonPrefix(String[] strs, String expected) {
        String actual = testObj.longestCommonPrefix(strs);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, "")
        );
    }
}
