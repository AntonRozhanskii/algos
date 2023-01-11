import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MySolutionTest {

    private final MySolution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void twoSum(int[] nums, int target, int[] expected) {

        int[] actual = testObj.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3,3}, 6, new int[]{0,1})
        );
    }
}
