package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MySolutionTest {

    private final MySolution testObj = new MySolution();

    @ParameterizedTest
    @MethodSource("testDataProvider")
    void removeDuplicates(int[] nums, int[] expected) {
        int[] actual = testObj.removeDuplicates(nums);
        assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> testDataProvider() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2, 2})
        );
    }
}
